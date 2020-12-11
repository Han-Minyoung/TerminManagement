package com.hmy.mapper;

import java.util.List;

import com.hmy.domain.TerminDocumentVO;

public interface TerminDocumentMapper {
	
	//기일부 전체 목록 보기 (기일, 시간 순으로)
	public List<TerminDocumentVO> getList();

}
