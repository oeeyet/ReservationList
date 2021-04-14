package com.mylist.service;

import java.util.List;

import com.mylist.domain.LoginVO;

public interface LoginService {

	public void register(LoginVO login);
	
	public LoginVO get(String email);
	
	public void modify(LoginVO login);
	
	public void remove(String email);
	
	public List<LoginVO> getList();
}
