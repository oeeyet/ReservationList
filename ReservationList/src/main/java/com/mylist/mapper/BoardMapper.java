package com.mylist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mylist.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
//	create(insert) 처리
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	//read(select) 처리
	public BoardVO read(Long bno);
	
	//delete처리
	public int delete(Long bno);
	
	//update 처리
	public int update(BoardVO board);
}
