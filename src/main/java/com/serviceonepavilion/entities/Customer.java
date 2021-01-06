package com.serviceonepavilion.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	
	//No need to create separate col for address ad list of address will take care of address col.
	
	//@Column(name = "CUSTOMER_ADDRESS")
	//private Address customerAddress;

	//@OneToMany - non owning side here we use mappedBy(mappedBy requires field name of owning entity not col name)
	@JsonBackReference
	@OneToMany( mappedBy = "customerAddress", cascade = CascadeType.ALL)
	private List<Address> addressList;
	
	@JsonBackReference
	@OneToMany( mappedBy = "customerId",  cascade = CascadeType.ALL)
	private List<Order> orderList;


	
}
