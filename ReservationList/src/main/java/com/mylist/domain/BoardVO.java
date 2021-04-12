package com.mylist.domain;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private Long tno; //not null
	private String rname; // not null
	private Long pno; // not null
	private Long rcount; // not null
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date rdate;
}
