package com.serviceonepavilion.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {
	@Id
	@Column(name = "ADDRESS_ID")
	// @GeneratedValue
	private int addressId;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "HOUSE_NO")
	private String houseNo;
	@Column(name = "CITY_NAME")
	private String cityName;
	@Column(name = "PINCODE")
	private String pincode;
	@Column(name = "STATE")
	private String state;
	
	//Owning side i.e. @ManyToOne- here we use @JoinCol
	@ManyToOne(fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID")//@JoinCol requires col. Name
	private Customer customerAddress;

	
}
