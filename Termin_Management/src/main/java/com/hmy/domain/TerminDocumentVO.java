package com.hmy.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TerminDocumentVO {
	
	private String client; //의뢰인
	private String litigation_type; //소종류
	private String other_party; //상대방
	private String case_number; //사건번호
	private String case_name; //사건명
	private String court; //법원
	
	@DateTimeFormat(pattern="yyyy-MM-dd") //들어오는 패턴이 yyyy-MM-dd ( ex>2018-01-01 )
	private Date termin; //기일
	private String time; //시간
	private String court_room; //법정호실
	private String termin_status; //기일사항(변론기일, 공판기일 등등)
	private String note; //비고
	private String td_num; //기일부번호 (PK)

}
