package edu.mum.service;

import java.util.List;

import edu.mum.domain.Reservation;


public interface ReservationService {
	
	public void save(Reservation reservation);
	
	public void update(Reservation reservation);
	
	public List<Reservation> findAll();
 
	public Reservation findOne(Long id);
	
	public void delete(Long id);
}
