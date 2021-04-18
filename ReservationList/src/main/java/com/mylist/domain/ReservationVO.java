package com.mylist.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ReservationVO {

	private Long rno;
	private String title;
	private String rname;
	private Long rcount;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date rdate;
}
