package com.mylist.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class LoginControllerTests {
	
	@Setter(onMethod_ = {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
	public void testList() throws Exception {
		
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	}
	
//	@Test
	public void testRegister() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/register")
				.param("email", "new@mail")
				.param("pw", "새비번")
				.param("name", "새이름")
				.param("title", "새가게이르음")
				).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
			
	
//	@Test
	public void testGet() throws Exception {
		
		log.info(mockMvc.perform(MockMvcRequestBuilders
				.get("/get")
				.param("email", "새로운이메일"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
	
//	@Test
	public void testModify() throws Exception {
		
		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/modify")
						.param("email", "2@gmail.com")
						.param("pw", "수정한비번")
						.param("name", "이름을바꿈")
						.param("title", "가게 이름바꿨"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
	
	@Test
	public void testRemove() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/remove")
				.param("email", "새로운이메일")
				).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
}
