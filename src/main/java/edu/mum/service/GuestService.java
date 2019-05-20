package edu.mum.service;

import java.util.List;

import edu.mum.domain.Guest;


public interface GuestService {
	
	public void save(Guest guest);
	
	public void saveFull( Guest guest);  		

	public List<Guest> findAll();
	
	public Guest findOne(Long id);

}
