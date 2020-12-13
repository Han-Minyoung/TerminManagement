package com.hmy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hmy.domain.TerminDocumentVO;
import com.hmy.mapper.TerminDocumentMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class TerminDocumentServiceImpl implements TerminDocumentService {
	
	private TerminDocumentMapper td_mapper;

	@Override //기일부 전체목록보기
	public List<TerminDocumentVO> viewList() {
		List<TerminDocumentVO> viewList = new ArrayList<TerminDocumentVO>();		
		viewList.addAll(td_mapper.getList1()); //기일이 잡혀있는 기일부 목록
		viewList.addAll(td_mapper.getList2()); //기일이 아직 잡히지 않은 기일부 목록			
		return viewList; //기일부 전체 목록
	}

	@Override //기일 등록
	public boolean terminRegister(TerminDocumentVO tdVO) {
	
		return td_mapper.insert(tdVO)==1; //기일 등록 성공하면 1이므로 true 리턴, 실패하면 !=1 -> false
	}

	@Override //기일 삭제
	public boolean terminRemove(int td_num) {
		
		return td_mapper.delete(td_num)==1; //기일 삭제 성공하면 true 리턴
	}

	@Override //기일부 수정
	public boolean terminModify(TerminDocumentVO tdVO) {
		
		return td_mapper.update(tdVO)==1; //기일부 수정 성공하면 true 리턴
	}

	@Override //기일부 상세보기
	public TerminDocumentVO viewDetail(int td_num) {
		
		return td_mapper.readDetail(td_num);
	}

}
