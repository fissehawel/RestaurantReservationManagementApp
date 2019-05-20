package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.dao.GuestDao;
import edu.mum.domain.Guest;
import edu.mum.service.GuestService;


@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestDao guestDao;
	
	
	public void save(Guest guest) {
		guestDao.save(guest);
		
	}

	public void saveFull(Guest guest) {
		// TODO Auto-generated method stub
		
	}

	public List<Guest> findAll() {
		
		return guestDao.findAll();
	}

	public Guest findOne(Long id) {
		
		return guestDao.findOne(id);
	}

}
