package com.serviceonepavilion.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ORDER_TABLE")
public class Order {
	@Id
	@Column(name = "OPRDER_ID")
	//@GeneratedValue
	private int orderId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "ORDER_STATUS")
	private Status orderStatus;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "ORDER_PRICE")
	private double orderPrice;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Resturant.class)
	@JoinColumn(name = "resturantId", referencedColumnName = "RESTURANT_ID")
	private Resturant resturantOrder;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Customer.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customerOrder;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Resturant getResturantOrder() {
		return resturantOrder;
	}

	public void setResturantOrder(Resturant resturantOrder) {
		this.resturantOrder = resturantOrder;
	}

	public Customer getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(Customer customerOrder) {
		this.customerOrder = customerOrder;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderStatus=" + orderStatus
				+ ", orderDate=" + orderDate + ", orderPrice=" + orderPrice + ", resturantOrder=" + resturantOrder
				+ ", customerOrder=" + customerOrder + "]";
	}
	
	
	
}
