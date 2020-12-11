package com.hmy.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TmVO {
	
	private String tm_client; //의뢰인
	private String tm_litigation_type; //소종류
	private String tm_other_party; //상대방
	private String tm_case_number; //사건번호
	private String tm_case_name; //사건명
	private String tm_court; //법원
	private Date tm_termin; //기일
	private String tm_time; //시간
	private String tm_court_room; //법정호실
	private String tm_termin_status; //기일사항(변론기일, 공판기일 등등)
	private String tm_note; //비고

}
