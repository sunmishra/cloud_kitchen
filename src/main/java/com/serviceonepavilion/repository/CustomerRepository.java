package com.serviceonepavilion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.serviceonepavilion.entities.Customer;
import com.serviceonepavilion.entities.Item;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer update();

}
