package com.mylist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	
	// 로그인 처리
	public void login(@Param("email")String email, @Param("pw")String pw);
	

}
