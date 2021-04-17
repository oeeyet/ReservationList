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
public class ReservationControllerTests {

	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
//	@Test
	public void testList() throws Exception{
		
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/reservation/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
//	@Test
	public void testRegister() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/reservation/register")
				.param("title", "할머니네원조")
				.param("rname", "화면")
				.param("rcount", "8")
				).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
	
//	@Test
	public void testGet() throws Exception {
		
		log.info(mockMvc.perform(MockMvcRequestBuilders
				.get("/reservation/get")
				.param("rno", "2"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
	
//	@Test
	public void testModify() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/reservation/modify")
				.param("rno", "2")
				.param("title", "할머니네원조")
				.param("rname", "화면수정한이름")
				.param("rcount", "2"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
	
	@Test
	public void testRemove() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/reservation/remove")
				.param("rno", "10"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
}
