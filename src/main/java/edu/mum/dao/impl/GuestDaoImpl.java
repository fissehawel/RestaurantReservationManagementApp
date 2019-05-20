package edu.mum.dao.impl;


import org.springframework.stereotype.Repository;

import edu.mum.dao.GuestDao;
import edu.mum.domain.Guest;

@Repository
public class GuestDaoImpl extends GenericDaoImpl<Guest> implements GuestDao {

	public GuestDaoImpl() {
		super.setDaoType(Guest.class);
	}
}
