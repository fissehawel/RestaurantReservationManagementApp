package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.GuestTableDao;
import edu.mum.domain.GuestTable;
import edu.mum.service.GuestTableService;

@Transactional
@Service
public class GuestTableServiceImpl implements GuestTableService {
	
	@Autowired
	private GuestTableDao tableDao;

	public void save(GuestTable guestTable) {
		tableDao.save(guestTable);
		
	}

	public List<GuestTable> findAll() {
		
		return (List<GuestTable>)tableDao.findAll();
	}

	public GuestTable findOne(Long id) {
		
		return (GuestTable) tableDao.findOne(id);
	}

	public List<GuestTable> findByCapacity(int capacity) {
		
		return (List<GuestTable>)tableDao.findByCapacity(capacity);
	}
	
	

}
