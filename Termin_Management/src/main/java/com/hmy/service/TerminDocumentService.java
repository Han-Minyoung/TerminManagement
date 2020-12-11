package com.hmy.service;

import java.util.List;

import com.hmy.domain.TerminDocumentVO;

public interface TerminDocumentService {
	
	//기일부 전체 목록 보기
	public List<TerminDocumentVO> viewList();
	
	//기일 등록
	public boolean terminRegister(TerminDocumentVO tdVO);
	
	//기일 삭제
	public boolean terminRemove(int td_num);
	
	//기일부 수정
	public boolean terminModify(TerminDocumentVO tdVO);
	
	//기일부 상세보기
	public TerminDocumentVO viewDetail(int td_num);

}
