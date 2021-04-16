package com.mylist.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mylist.domain.ReservationVO;
import com.mylist.mapper.ReservationMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReservationControllerTests {
	
	@Setter(onMethod_ = @Autowired)
	private ReservationMapper mapper;
	
//	@Test
	public void testGetList() {
		
		mapper.getList().forEach(reservation -> log.info(reservation));
	}
	
	@Test
	public void testInset() {
		
		ReservationVO re = new ReservationVO();
		re.setTitle("할머니네");
		re.setRname("예약자2");
		re.setRcount(5L);
		
		mapper.insert(re);
		
		log.info(re);
		
	}
}
