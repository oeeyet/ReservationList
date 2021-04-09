package com.mylist.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mylist.domain.BoardVO;
import com.mylist.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class BoardController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
	}

	private BoardService service;

	@GetMapping("")
	public String Main(Model model) {

		log.info("Main 페이지 입니다.");
		// log.info(service.getList());
		
		model.addAttribute("boardList", service.getList());
		
		return "main";
	}

	@GetMapping("/register")
	public String register() {

		log.info("GET Register");
		return "register";
	}
	
	@PostMapping("/register")
	public String registerEdit(BoardVO board) {
		
		log.info("Regitser Post!!");
		log.info(board);
		
		return "register";
	}

	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {

		log.info("modify: " + board);

		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");

		}

		return "redirect:/list";
	}

	@PostMapping("/remove") // 삭제는 반드시 POST!!
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {

		log.info("remove......" + bno);

		if (service.remove(bno)) {

			rttr.addFlashAttribute("result", "success");

		}

		return "redirect:/list";
	}
}
