package com.serviceonepavilion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.serviceonepavilion.entities.Item;
import com.serviceonepavilion.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

	Order update();

}
