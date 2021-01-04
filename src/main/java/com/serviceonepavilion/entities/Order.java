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

import lombok.Data;

@Data
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
	private OrderStatus orderStatus;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "ORDER_PRICE")
	private double orderPrice;
	@Column(name = "TRANSCATION_ID")
	private long transactionId;
	@Column(name = "TRANSACTION_STATUS")
	private TransactionStatus transactionStatus;
	@Column(name = "PAYMENT_TYPE")
	private PaymentType paymentType;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "resturantId" )
	private Resturant resturant;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customerId;


	
	
}
