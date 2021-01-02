package com.serviceonepavilion.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceonepavilion.entities.Customer;
import com.serviceonepavilion.repository.CustomerRepository;
import com.serviceonepavilion.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public Customer saveorUpdateCustomer(Customer customer) {
		Customer cust = null;
		if (!customerRepository.existsById(customer.getCustomerId())) {
			cust = customerRepository.save(customer);
		} else
			cust = customerRepository.update();
		return cust;
	}

	@Override
	public int removeCustomer(int id) {
		customerRepository.deleteById(id);
		return id;
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> findAllCustomer() {
		List<Customer> listCustomers = customerRepository.findAll();
		return listCustomers;
	}
}
