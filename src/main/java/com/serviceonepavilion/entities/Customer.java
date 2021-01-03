package com.serviceonepavilion.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER_TABLE")
public class Customer {
	@Id
	@Column(name = "CUSTOMER_ID")
	//@GeneratedValue
	private int customerId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "CUSTOMER_CONTACT")
	private String customerContactNo;
	@Column(name = "CUSTOMER_ADDRESS")
	private Address customerAddress;

	//@OneToMany - non owning side here we use mappedBy
	@OneToMany( mappedBy = "customerAddress",  targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Address> addressList;
	
	@OneToMany( mappedBy = "customerOrder",  targetEntity = Order.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Order> orderList;


	
}
