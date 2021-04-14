package com.mylist.service;

import static org.junit.Assert.assertNotNull;

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
public class LoginServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private LoginService service;
	
//	@Test
	public void testExist() {
		
		log.info(service);
		assertNotNull(service);
	}
	@Test
	public void testRegister() {
		
		LoginVO login = new LoginVO();
		login.setEmail("새로운이메일");
		login.setName("새로운 이름");
		login.setPw("새비밀번호");
		login.setTitle("새로운 식당이름");
		
		service.register(login);
		
		log.info("생성된 게시물의 번호: " + login.getEmail());

	}
	
}
