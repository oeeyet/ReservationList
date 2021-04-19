package com.mylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mylist.domain.ReservationVO;
import com.mylist.service.ReservationService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/reservation/*")
@AllArgsConstructor
public class ReservationController {
	
	private ReservationService service;
	
	@GetMapping("/reservationlist")
	public void list(Model model) {
		
		log.info("rlist");
		
		model.addAttribute("rlist", service.getList());
	}
	
	@PostMapping("/register")
	public String register(Model model, ReservationVO re, RedirectAttributes rttr) {
		
		log.info("register: " + re);
		
		service.register(re);
		
		model.addAttribute("result", service.getList());
		
		rttr.addFlashAttribute("result", re.getRno());
		
		return "/owner/reservationlist";
	}
	
	@GetMapping("/register")
	public void register(@ModelAttribute("title") String title, Model model) {
		log.info("/register");
	} // 게시물 등록작업은 POST처리지만, 화면 입력을 받아야 하므로!GET방식 입력페이지 볼 수 있게 추가한 것 !
	
	@GetMapping("/get")
	public void get(@RequestParam("rno") Long rno, Model model) {
		
		log.info("/get");
		model.addAttribute("reservation", service.get(rno));
	}
	
	@PostMapping("/modify")
	public String modify(ReservationVO re, RedirectAttributes rttr) {
		
		log.info("modify : " + re);
		
		if(service.modify(re)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/reservation/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("rno") Long rno, RedirectAttributes rttr) {
		
		log.info("remove....!" + rno);
		if(service.remove(rno)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/reservation/list";
	}
	
	

}
