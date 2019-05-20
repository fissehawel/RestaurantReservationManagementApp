package edu.mum.dao;

import java.util.List;

import edu.mum.domain.GuestTable;
import edu.mum.domain.TableType;

public interface GuestTableDao extends GenericDao<GuestTable> {
	
	public List<GuestTable> findByCapacity(int capacity);
	
	public List<GuestTable> findByType(TableType tableType);


}
