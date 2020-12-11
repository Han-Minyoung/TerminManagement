package com.hmy.mapper;

import java.util.List;

import com.hmy.domain.TerminDocumentVO;

public interface TerminDocumentMapper {
	
	//기일부 목록 보기 (기일 잡혀있는 사건)
	public List<TerminDocumentVO> getList1();
	
	//기일부 목록 보기 (기일 아직 잡혀있지 않은 사건 / td_termin이 null값)
	public List<TerminDocumentVO> getList2();
	
	//기일 등록
	public int insert(TerminDocumentVO tdVO);
	
	//기일 삭제 - 기일부번호로
	public int delete(int td_num);
	
	//기일부 수정
	public int update(TerminDocumentVO tdVO);
	
	//기일부 상세보기
	public TerminDocumentVO readDetail(int td_num);

}
