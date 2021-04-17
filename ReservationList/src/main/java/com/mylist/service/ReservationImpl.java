package com.mylist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylist.domain.ReservationVO;
import com.mylist.mapper.ReservationMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ReservationImpl implements ReservationService{
	
	@Setter(onMethod_ = @Autowired)
	private ReservationMapper mapper;

	@Override
	public void register(ReservationVO reservation) {
		
		log.info("register...>!!!" + reservation);
		
		mapper.insert(reservation);
		
	}

	@Override
	public ReservationVO get(Long rno) {
		
		log.info("get.>>!.!.!>!>!>!>!>!>!>!>! " + rno);
		
		return mapper.read(rno);
	}

	@Override
	public boolean modify(ReservationVO reservation) {
		
		log.info("modify..!>!>!>!>!>" + reservation);
		
		return mapper.update(reservation) == 1;
	}

	@Override
	public boolean remove(Long rno) {
		log.info("Remove...>>!!!!" + rno);
		
		return mapper.delete(rno) == 1;
	}

	@Override
	public List<ReservationVO> getList() {
		
		log.info("getList.......");
		
		return mapper.getList();
		
	}
	
	
	
	

}
