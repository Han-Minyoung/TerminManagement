package com.hmy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hmy.domain.TerminDocumentVO;
import com.hmy.service.TerminDocumentService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/td/*")
public class TerminDocumentController {
	
	private TerminDocumentService td_service;
	
	@GetMapping("/tmList") //기일부 목록
	public void tmlist(Model model) {
		log.info("list");
		model.addAttribute("tmlist", td_service.viewList());
	}
	
	@PostMapping("/tmRegister") //기일 등록
	public String tmRegister(TerminDocumentVO tdVO) {
		td_service.terminRegister(tdVO);
		return "redirect:/td/tmList"; //기일 등록 후 기일부 목록으로 이동
	}
	
	@PostMapping("/tmRemove") //기일 삭제
	public String tmRemove(int td_num) {
		td_service.terminRemove(td_num);
		return "redirect:td/tmList"; //기일 삭제 후 기일부 목록으로
	}

}
