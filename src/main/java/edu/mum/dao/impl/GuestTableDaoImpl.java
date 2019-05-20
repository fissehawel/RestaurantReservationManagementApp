package edu.mum.dao.impl;

import edu.mum.domain.TableType;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.dao.GuestTableDao;
import edu.mum.domain.GuestTable;

@Repository
public class GuestTableDaoImpl extends GenericDaoImpl<GuestTable> implements GuestTableDao {

	public GuestTableDaoImpl() {
		super.setDaoType(GuestTable.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<GuestTable> findByCapacity(int capacity){
		List<GuestTable> guestTables = (List<GuestTable>) entityManager
									.createQuery("Select gt from guestTable as gt where gt.capacity =: capacity")
									.setParameter("capacity", capacity)
									.getResultList();
		
		return guestTables;
		
	}

	@SuppressWarnings("unchecked")
	public List<GuestTable> findByType(TableType tableType) {
		
		List<GuestTable> guestTables = (List<GuestTable>) entityManager
				.createQuery("Select gt from guestTable as gt where gt.tableType =: tableType")
				.setParameter("tableType", tableType)
				.getResultList();

		return guestTables;
	}

}
