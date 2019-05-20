package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.dao.AddressDao;
import edu.mum.domain.Address;
import edu.mum.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	
	@Autowired
	private AddressDao addressDao;
	
	public void save(Address address) {
		addressDao.save(address);

	}

	public void update(Address address) {
		addressDao.update(address);

	}

	public List<Address> findAll() {

		return addressDao.findAll();
	}

	public Address findOne(Long id) {

		return addressDao.findOne(id);
	}

}
