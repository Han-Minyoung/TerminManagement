package com.hmy.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TerminDocumentVO {
	
	private String td_client; //의뢰인
	private String td_litigation_type; //소종류
	private String td_other_party; //상대방
	private String td_case_number; //사건번호
	private String td_case_name; //사건명
	private String td_court; //법원
	private Date td_termin; //기일
	private String td_time; //시간
	private String td_court_room; //법정호실
	private String td_termin_status; //기일사항(변론기일, 공판기일 등등)
	private String td_note; //비고
	private String td_num; //기일부번호 (PK)

}
