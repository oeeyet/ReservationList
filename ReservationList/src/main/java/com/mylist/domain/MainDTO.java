package com.mylist.domain;





import lombok.Data;

@Data
public class MainDTO {
	
	private String name;
	private int count;
	private String etc;
	private int bno;

//	@DateTimeFormat(pattern = "yyyy/MM/dd")
//	private Date dueDate;

}
