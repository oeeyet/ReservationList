package com.mylist.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

//	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}

//	@Test
	public void testInsert() throws ParseException {

		String time = "2020-05-11";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-dd-MM");

		BoardVO board = new BoardVO();
		board.setRname("오은지");
		board.setPno(1L);
		board.setRcount(3L);
		board.setRdate(format.parse(time));

		mapper.insert(board);

		log.info(board);
	}

//	@Test // 얘는 속성이1개만 존재해서 별도의 get파라미터명()을 사용하지 않고 처리한다.
	public void testRead() {

		BoardVO board = mapper.read(7L);

		log.info(board);
	}

//	@Test
	public void testDelete() {

		log.info("DELETE COUNT: " + mapper.delete(7L));
	}
	
	@Test
	public void testUpdate() throws ParseException {
		
		String time = "2020-04-08";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		BoardVO board = new BoardVO();
		//실행 전 존재하는 번호인지 확인할 것
		board.setBno(8L);
		board.setRname("오은지");
		board.setPno(4L);
		board.setRcount(4L);
		board.setRdate(format.parse(time)); 
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
	}
	
	
}
