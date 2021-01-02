package com.serviceonepavilion.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customerAddress;

	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

}
