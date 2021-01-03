package com.serviceonepavilion.entities;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "RESTURANT_TABLE")
public class Resturant {
	@Id
	@Column(name = "RESTURANT_ID")
	//@GeneratedValue
	private int resturantId;
	@Column(name = "RESTURANT_NAME")
	private String resturantName;
	@Column(name = "RESTURANT_CONTACT")
	private String resturantContactNo;
	@Column(name = "RESTURANT_ADDRESS")
	private String resturantAddress;
	@Column(name = "OPENING_TIME")
	private Time openingTime;
	@Column(name = "CLOSING_TIME")
	private Time closingTime;
	//workingdays
	
	@OneToOne( mappedBy = "resturantOrder",  cascade = CascadeType.ALL, targetEntity = Order.class, fetch = FetchType.LAZY)
	private Order order;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Menu.class )
	@JoinColumn(name = "menuId", referencedColumnName = "MENU_ID")
	private Menu resturantMenu;


	
}
