package com.serviceonepavilion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.serviceonepavilion.entities.Item;
import com.serviceonepavilion.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{

	Menu update();

}
