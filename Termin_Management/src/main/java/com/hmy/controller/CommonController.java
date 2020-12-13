package com.hmy.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	
	@GetMapping("/login") //로그인이 필요한 페이지로 들어왔을 때
	public void login() {
		
	}
	
	@GetMapping("/accessError") //접근할 수 없는 사용자가 접근했을 때
	public void accessError(Authentication auth, Model model) {
		log.info("접근제한: "+auth);
		model.addAttribute("message", "접근제한");
	}

}
