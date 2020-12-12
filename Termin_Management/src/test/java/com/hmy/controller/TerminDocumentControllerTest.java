package com.hmy.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
						"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@WebAppConfiguration
@Log4j
public class TerminDocumentControllerTest {
	
	@Setter(onMethod_= {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before //먼저 실행되고 @Test 실행
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test //기일부 목록
	public void testTmList() throws Exception {
		log.info("리스트: "+mockMvc.perform(MockMvcRequestBuilders.get("/td/tmList")).andReturn()
				.getModelAndView().getModelMap());
	}
	
	@Test //기일 등록
	public void testTmRegister() throws Exception {
		log.info("결과페이지: "+mockMvc.perform(MockMvcRequestBuilders.post("/td/tmRegister")
				.param("td_client", "테스트 의뢰인").param("td_other_party", "테스트 상대방"))
		.andReturn().getModelAndView().getViewName()); //열리는 페이지-/td/tmList
	}
	
	@Test //기일 삭제
	public void testTmRemove() throws Exception {
		log.info("결과페이지: "+mockMvc.perform(MockMvcRequestBuilders.post("/td/tmRemove")
				.param("td_num", "2")).andReturn().getModelAndView().getViewName()); ///td/tmList
		
	}
	

}
