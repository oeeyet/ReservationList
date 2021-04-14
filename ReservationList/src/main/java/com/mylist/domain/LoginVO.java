package com.mylist.domain;

import lombok.Data;

@Data
public class LoginVO {

//email, pw, name, gender, title, titleName
	
	private String email;
	private String pw;
	private String name;
	private String title;
	private String titleName;

}
