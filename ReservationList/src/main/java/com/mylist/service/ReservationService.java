package com.mylist.service;

import java.util.List;

import com.mylist.domain.ReservationVO;

public interface ReservationService {

	public void register(ReservationVO reservation);
	
	public ReservationVO get(Long rno);
	
	public boolean modify(ReservationVO reservation);
	
	public boolean remove(Long rno);
	
	public List<ReservationVO> getList();
	
}
