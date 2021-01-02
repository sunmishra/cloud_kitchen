package com.serviceonepavilion.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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

	@OneToMany(/* mappedBy = "customerAddress", */ targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Address> addressList;
	
	@OneToMany(/* mappedBy = "customerOrder", */ targetEntity = Order.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Order> orderList;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContactNo="
				+ customerContactNo + ", customerAddress=" + customerAddress + ", addressList=" + addressList + "]";
	}

	
}
