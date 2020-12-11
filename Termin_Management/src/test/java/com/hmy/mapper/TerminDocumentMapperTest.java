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
	
	
	@Test
	public void testGetList() {
		List<TerminDocumentVO> list =mapper.getList();
		for(TerminDocumentVO temp : list) {
			log.info("기일부 목록: "+temp);
		}
	}

}
