package com.mylist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylist.domain.BoardVO;
import com.mylist.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Override // 등록작업구현
	public void register(BoardVO board) {

		log.info("register........" + board);

		mapper.insertSelectKey(board);

	}

	@Override // 조회 작업 구현
	public BoardVO get(Long bno) {

		log.info("get...!!!" + bno);

		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {

		log.info("modify ! ......." + board);

		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long bno) {
		
		log.info("remove ! ......." + bno);

		return mapper.delete(bno) == 1;
	}

	@Override // 목록(리스트)작업구현
	public List<BoardVO> getList() {

		log.info("getList........!!!!");

		return mapper.getList();
	}

}
