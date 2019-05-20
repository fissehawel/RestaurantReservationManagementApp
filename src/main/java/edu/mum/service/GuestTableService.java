package edu.mum.service;

import java.util.List;

import edu.mum.domain.GuestTable;

public interface GuestTableService {
	
	public void save(GuestTable guestTable);
	
	public List<GuestTable> findAll();
	
	public GuestTable findOne(Long id);
	
	public List<GuestTable> findByCapacity(int capacity);


}
