package com.mylist.service;

import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mylist.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired })
	private BoardService service;
	
//	@Test
	public void testExist() {
		
		log.info(service);
		assertNotNull(service);
	}

//	@Test 등록구현 테스트 
	public void testRegister() throws ParseException {
		
		String time = "2020-05-11";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-dd-MM");

		BoardVO board = new BoardVO();
		
		board.setRname("오은지");
		board.setPno(1L);
		board.setRcount(3L);
		board.setRdate(format.parse(time));

		service.register(board);

		log.info("생성된 게시물의 번호 : " + board.getBno());
		}
	
//	@Test //목록(리스트)작업 구현 테스트
	public void testGetList() {
		
		service.getList().forEach(board -> log.info(board));
//		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
	}
	
//	@Test // 조회 작업 구현 테스트 
	public void testGet() {
		log.info(service.get(15L));
	}
	
//	@Test
	public void testDelete() {
		
		//게시물 번호의 존재 여부를 확인하고 테스트 할 것
		log.info("REMOVE RESULT: " + service.remove(24L));
	}
	
//	@Test
	public void testUpdate() {
		
		BoardVO board = service.get(9L);
		
		if (board == null) {
			return;
		}
		board.setRname("은지오");
		log.info("MODIFY RESULT: " + service.modify(board));
	}
	
	
}
