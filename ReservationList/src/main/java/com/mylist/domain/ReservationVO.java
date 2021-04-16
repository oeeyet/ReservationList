package com.mylist.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReservationVO {

	private Long rno;
	private String title;
	private String rname;
	private Long rcount;
	private Date rdate;
}
