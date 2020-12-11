package com.hmy.service;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hmy.domain.TerminDocumentVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TerminDocumentServiceTest {
	
	@Autowired
	private TerminDocumentService service;
	
	@Test //객체 주입 테스트
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test //기일부 목록 전체보기 테스트
	public void testViewList() {
		List<TerminDocumentVO> tdVO=service.viewList();
		log.info("기일부 목록");
		for(TerminDocumentVO temp : tdVO) {
			log.info(tdVO);
		}
	}
	
	@Test //기일 등록 테스트
	public void testTerminRegister() {
		TerminDocumentVO tdVO = new TerminDocumentVO();
		tdVO.setTd_client("이방원");
		tdVO.setTd_case_name("손해배상(기)");
		tdVO.setTd_case_number("2016가단55555");
		tdVO.setTd_court("안양지원제3단독");
		tdVO.setTd_litigation_type("민사");
		log.info("기일등록 성공: "+service.terminRegister(tdVO));
	}
	
	@Test //기일 삭제 테스트
	public void testTerminRemove() {
		log.info("기일삭제 성공: "+service.terminRemove(8));
	}
	
	//기일 수정 테스트
	@Test
	public void testTerminModify() {
		TerminDocumentVO tdVO = new TerminDocumentVO();
		tdVO.setTd_num("8");
		tdVO.setTd_client("수정");
		tdVO.setTd_case_name("수정수정");
		tdVO.setTd_case_number("20ㄴㄴㄴ55");
		tdVO.setTd_court("안양지원제3단독");
		tdVO.setTd_litigation_type("민사");
		tdVO.setTd_termin("2010-04-11");
		log.info("기일수정 성공: "+service.terminModify(tdVO));
	}

	//기일부 상세보기 테스트
	@Test
	public void testViewDetail() {	
		log.info("기일부 상세보기: "+service.viewDetail(3));	
	}
}
