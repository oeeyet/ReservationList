package com.mylist.mapper;

import java.util.List;

import com.mylist.domain.LoginVO;

public interface LoginMapper {
	
	public List<LoginVO> getList();
	
	//create(insert) 처리
	public void insert(LoginVO login);

	//read(select) 처리
	public LoginVO read(String email);
	
//	delete처리
	public void delete(String email);
	
	//update 처리
	public void update(LoginVO login);

}
