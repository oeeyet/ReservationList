package com.mylist.service;

import java.util.List;

import com.mylist.domain.LoginVO;

public interface LoginService {

	public void register(LoginVO login);
	
	public LoginVO get(String email);
	
//	public boolean modify(BoardVO board);
//	
//	public boolean remove(Long bno);
	
//	public List<BoardVO> getList();
	public List<LoginVO> getList();
}
