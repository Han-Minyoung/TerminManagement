package com.hmy.mapper;

import java.util.List;

import com.hmy.domain.TerminDocumentVO;

public interface TerminDocumentMapper {
	
	//기일부 전체 목록 보기 (기일, 시간 순으로)
	public List<TerminDocumentVO> getList();
	
	//기일 등록
	public int insert(TerminDocumentVO tdVO);
	
	//기일 삭제 - 기일부번호로
	public int delete(int td_num);
	
	//기일부 수정
	public int update(TerminDocumentVO tdVO);
	
	//기일부 상세보기
	public TerminDocumentVO readDetail(int td_num);

}
