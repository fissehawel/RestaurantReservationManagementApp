package edu.mum.dao.impl;


import org.springframework.stereotype.Repository;

import edu.mum.dao.MenuDao;
import edu.mum.domain.Menu;

@Repository
public class MenuDaoImpl extends GenericDaoImpl<Menu> implements MenuDao {

	public MenuDaoImpl() {
		super.setDaoType(Menu.class);
	}

}
