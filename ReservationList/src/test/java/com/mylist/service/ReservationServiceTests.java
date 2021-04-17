package com.mylist.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mylist.domain.ReservationVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReservationServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private ReservationService se;
	
//	@Test
	public void testExist() {
		
		log.info(se);
		assertNotNull(se);
	}
	
//	@Test
	public void testRegister() {
		
		ReservationVO re = new ReservationVO();
		re.setTitle("할머니네");
		re.setRname("새로운예약자임");
		re.setRcount(2L);
		
		se.register(re);
		log.info("생성된 번호 입니다 :" + re.getRno());
	}
	
//	@Test
	public void testGetList() {
		
		se.getList().forEach(reservation -> log.info(reservation));
	}
	
//	@Test
	public void testGet() {
		
		log.info(se.get(1L));
	}
	
//	@Test
	public void testDelete() {
		
		 se.remove(1L);
		
		log.info("REMOVE RESULT: ");
	}
	
	@Test
	public void testUpdate() {
		
		ReservationVO re = se.get(2L);
		
		if(re == null) {
			
			return;
		}
		re.setRname("이름 수정1");
		se.modify(re);
		
	}

}
