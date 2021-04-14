package com.mylist.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mylist.domain.LoginVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class LoginMapperTests {

	@Setter(onMethod_ = @Autowired)
	private LoginMapper mapper;
	
//	@Test
	public void testGetList() {
		mapper.getList().forEach(login -> log.info(login));
	}
	
	@Test
	public void testInsert() {
		LoginVO login = new LoginVO();
		login.setEmail("test@email.com");
		login.setName("은지테스트");
		login.setPw("비밀번호");
		login.setTitle("식당");
		
		mapper.insert(login);
		
		log.info(login);
		
	}
	
	
}
