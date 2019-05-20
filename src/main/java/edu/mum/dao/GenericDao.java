package edu.mum.dao;

import java.util.List;

public interface GenericDao<T> {
	
	public void save(T t);

	public void delete(T t);
	 
    public void delete(Long id);

    public T findOne(Long id);

    public T update(T t);   
    
    public List<T> findAll();

	public List<T> findAll(String s, Object  hint );
	

}
