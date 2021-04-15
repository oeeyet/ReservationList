package com.mylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mylist.domain.LoginVO;
import com.mylist.service.LoginService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("")
@AllArgsConstructor
public class OwnerController {
	
	private LoginService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		
		log.info("list");
		
		model.addAttribute("list", service.getList());
	}
	
	@PostMapping("/register")
	public String register(LoginVO login, RedirectAttributes rttr) {
		
		log.info("register: " + login);
		
		service.register(login);
		
		rttr.addFlashAttribute("result", login.getEmail());
		
		return "redirect:/list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("email") String email, Model model) {
		log.info("/get");
		model.addAttribute("login", service.get(email));

	}
	@PostMapping("/modify")
	public String modify(LoginVO login, RedirectAttributes rttr) {
		
		log.info("modify: " + login);
		
		service.modify(login);
//		{rttr.addFlashAttribute("result", "success");
//		}
		return "redirect:/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("email") String email, RedirectAttributes rttr) {
		log.info("remove..." + email);
		
		service.remove(email);
		
		return "redirect:/list";
		
	}
	
}
