package com.serviceonepavilion.service;

import java.util.List;

import com.serviceonepavilion.entities.Menu;

public interface MenuService {

	Menu saveorUpdateMenu(Menu menu);

	int removeMenu(int id);

	Menu getMenuById(int id);

	List<Menu> findAllMenu();

}