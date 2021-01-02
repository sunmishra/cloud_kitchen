package com.serviceonepavilion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.serviceonepavilion.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{

	Item update();

}
