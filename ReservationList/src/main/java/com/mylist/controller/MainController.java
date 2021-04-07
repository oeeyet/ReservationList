package com.mylist.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.mylist.domain.MainDTO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MainController {
	
//	Date표시를 위한 (파라미터를 바인딩할 때 자동 호출)
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	// test용!
//	@RequestMapping("")
	public void basic() {
		
		log.info("main 잘 돌아가고 있다!");
	}
	
	// @GetMapping("/test1")
	public String test1(MainDTO dto) {
		
		log.info("" + dto);
		
		return "/test1";
	}
//	@GetMapping("/test2")
	public String test2(@RequestParam("name") String name, @RequestParam("count") int count, @RequestParam("etc") String etc) {
		
		log.info("name : " + name);
		log.info("name : " + count);
		log.info("name : " + etc);
		
		return"/test2";
	}
	@GetMapping("/")
	public String main(MainDTO dto) {
		
		log.info("dto : " + dto);
		
		return "main";
	}
}
