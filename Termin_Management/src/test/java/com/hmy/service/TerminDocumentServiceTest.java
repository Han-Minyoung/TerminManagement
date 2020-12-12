package com.hmy.service;

import static org.junit.Assert.assertNotNull;

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
			log.info(temp);
		}
	}
	
	@Test //기일 등록 테스트
	public void testTerminRegister() {
		TerminDocumentVO tdVO = new TerminDocumentVO();
		tdVO.setClient("이방원");
		tdVO.setCase_name("손해배상(기)");
		tdVO.setCase_number("2000가단1111");
		tdVO.setCourt("안양지원제3단독");
		tdVO.setLitigation_type("민사");
		log.info("기일등록 성공: "+service.terminRegister(tdVO));
	}
	
	//기일 수정 테스트
	@Test
	public void testTerminModify() {
		TerminDocumentVO tdVO = new TerminDocumentVO();
		tdVO.setTd_num("9");
		tdVO.setClient("수정");
		tdVO.setCase_name("수정수정");
		tdVO.setCase_number("55");
		tdVO.setCourt("안양지원제3단독");
		tdVO.setNote("비고수정");
		log.info("기일수정 성공: "+service.terminModify(tdVO));
	}
	
	@Test //기일 삭제 테스트
	public void testTerminRemove() {
		log.info("기일삭제 성공: "+service.terminRemove(9));
	}

	//기일부 상세보기 테스트
	@Test
	public void testViewDetail() {	
		log.info("기일부 상세보기: "+service.viewDetail(3));	
	}
}
