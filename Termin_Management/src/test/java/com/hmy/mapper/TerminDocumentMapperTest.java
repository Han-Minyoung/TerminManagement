package com.hmy.mapper;

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
public class TerminDocumentMapperTest {
	
	@Autowired
	private TerminDocumentMapper mapper;
	
	
	@Test //기일부 목록보기 테스트(기일 잡힌)
	public void testGetList1() {
		List<TerminDocumentVO> list =mapper.getList1();
		for(TerminDocumentVO temp : list) {
			log.info("기일부 목록: "+temp);
		}
	}
	
	@Test //기일부 목록보기 테스트(기일 안잡힌)
	public void testGetList2() {
		List<TerminDocumentVO> list =mapper.getList2();
		for(TerminDocumentVO temp : list) {
			log.info("기일부 목록: "+temp);
		}
	}
	
	@Test //기일 등록 테스트
	public void testInsert() {
		TerminDocumentVO tdVO = new TerminDocumentVO();
		tdVO.setTd_client("의뢰인");
		tdVO.setTd_case_name("건물명도");
		log.info("글 등록 개수: "+mapper.insert(tdVO)); 
	}
	
	@Test //기일 삭제 테스트
	public void testDelete() {
		log.info("글 삭제 개수: "+ mapper.delete(4)); 
	}
	
	@Test //기일부 수정 테스트
	public void testUpdate() {
		TerminDocumentVO tdVO = new TerminDocumentVO();
		tdVO.setTd_num("5");
		tdVO.setTd_client("수정의뢰인");
		tdVO.setTd_case_name("건물명도");
		log.info("글 수정 개수: " + mapper.update(tdVO)); 
	}
	
	@Test//기일부 상세보기
	public void testReadDetail() {
		TerminDocumentVO tdVO=mapper.readDetail(2);
		log.info("상세보기: "+tdVO);	
	}

}
