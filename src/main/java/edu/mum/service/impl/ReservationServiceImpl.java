package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.dao.ReservationDao;
import edu.mum.domain.Reservation;
import edu.mum.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;
	
	public void save(Reservation reservation) {
		reservationDao.save(reservation);

	}

	public void update(Reservation reservation) {
		reservationDao.update(reservation);

	}

	public List<Reservation> findAll() {
		
		return reservationDao.findAll();
	}

	public Reservation findOne(Long id) {
		
		return reservationDao.findOne(id);
	}

	public void delete(Long id) {
		reservationDao.delete(id);
	}

}
