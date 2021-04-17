package com.mylist.mapper;

import java.util.List;

import com.mylist.domain.ReservationVO;

public interface ReservationMapper {

	public List<ReservationVO> getList();
	
	public void insert(ReservationVO reservation);
	
//	public void insertSelectKey(ReservationVO reservation);
	
	// read(select)처리 
	public ReservationVO read(Long rno);
	
	//delete 처리
	public int delete(Long rno);
	
	public int update(ReservationVO reservation);
	
}
