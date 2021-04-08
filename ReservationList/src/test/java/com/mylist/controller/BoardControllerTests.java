package com.mylist.controller;




import java.text.SimpleDateFormat;

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

//Test for Controller
@WebAppConfiguration

@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j

public class BoardControllerTests {

	
	@Setter(onMethod_ = { @Autowired })
	private WebApplicationContext ctx;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

//	@Test
	public void testList() throws Exception {

		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/list")).andReturn().getModelAndView().getModelMap());

	}
	
//	@Test
	public void testRegister() throws Exception {

		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/register").param("rname", "일은지")
						.param("pno", "1").param("rcount", "1"))
				.andReturn().getModelAndView().getViewName();

		log.info(resultPage);
	}

//	@Test
	public void testGet() throws Exception {

		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get").param("bno", "2")).andReturn()
				.getModelAndView().getModelMap());
	}

//	@Test
	public void testModify() throws Exception {

		String time = "2020-04-08";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/modify")
						.param("bno", "10").param("rname", "수정은지")
						.param("pno", "2").param("rcount", "2").param("rdate", time))
				.andReturn().getModelAndView().getViewName();

		log.info(resultPage);
	}

	@Test 
	public void testRemove() throws Exception {

		String resultPage = mockMvc.perform(MockMvcRequestBuilders
				.post("/remove").param("bno", "18")).andReturn()
				.getModelAndView().getViewName();
		log.info(resultPage);
	}


}

