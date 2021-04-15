package com.mylist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylist.domain.LoginVO;
import com.mylist.mapper.LoginMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class LoginSrivceImpl implements LoginService {
	
	@Setter(onMethod_ = @Autowired)
	private LoginMapper mapper;
	
	@Override
	public void register(LoginVO login) {
		
		log.info("register........" + login);

		mapper.insert(login);
		
	}

	@Override
	public LoginVO get(String email) {
		
		log.info("get....." + email);
		
		return mapper.read(email);
	}

	@Override
	public List<LoginVO> getList() {
		
		log.info("getList....>!!!!!!....");
		
		return mapper.getList();
	}

	@Override
	public void modify(LoginVO login) {
		
		mapper.update(login);
		log.info("modify....!>!>!..." + login);
		
		
	}

	@Override
	public void remove(String email) {
		mapper.delete(email);
		log.info("remove...>!>!>!>!>!" + email);
		
	}
	
	

	
}
