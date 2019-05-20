package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import edu.mum.dao.GenericDao;

@Repository
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	
	@PersistenceContext
	protected EntityManager entityManager;
	
	protected Class<T> daoType;
	
	public void setDaoType(Class<T> daoType) {
		this.daoType = daoType;
	}
	
	
	public void save(T entity) {
		entityManager.persist(entity);
		
	}

	public void delete(T entity) {
		entityManager.remove(entity);
		
	}
	
	public void delete(Long id) {
		T entity = findOne(id);
		entityManager.remove(entity);
		
	}

	public T findOne(Long id) {
		
		return (T) entityManager.find(daoType, id);
	}

	public T update(T entity) {
		
		return entityManager.merge( entity );
	}


	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		
		return entityManager.createQuery("from " + daoType.getName())
							.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(String s,Object  hint ){
 	    return (List<T>)  entityManager.createQuery("SELECT m FROM Member AS m") 
 	    		.setHint(s,hint).getResultList();
  	}

}
