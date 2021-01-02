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

	
	public Resturant() {
	}
	
	public Resturant(int resturantId, String resturantName, String resturantContactNo, String resturantAddress,
			Time openingTime, Time closingTime, Order order, Menu resturantMenu) {
		this.resturantId = resturantId;
		this.resturantName = resturantName;
		this.resturantContactNo = resturantContactNo;
		this.resturantAddress = resturantAddress;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.order = order;
		this.resturantMenu = resturantMenu;
	}

	public int getResturantId() {
		return resturantId;
	}

	public void setResturantId(int resturantId) {
		this.resturantId = resturantId;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getResturantContactNo() {
		return resturantContactNo;
	}

	public void setResturantContactNo(String resturantContactNo) {
		this.resturantContactNo = resturantContactNo;
	}

	public String getResturantAddress() {
		return resturantAddress;
	}

	public void setResturantAddress(String resturantAddress) {
		this.resturantAddress = resturantAddress;
	}

	public Time getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(Time openingTime) {
		this.openingTime = openingTime;
	}

	public Time getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(Time closingTime) {
		this.closingTime = closingTime;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Menu getResturantMenu() {
		return resturantMenu;
	}

	public void setResturantMenu(Menu resturantMenu) {
		this.resturantMenu = resturantMenu;
	}

	@Override
	public String toString() {
		return "Resturant [resturantId=" + resturantId + ", resturantName=" + resturantName + ", resturantContactNo="
				+ resturantContactNo + ", resturantAddress=" + resturantAddress + ", openingTime=" + openingTime
				+ ", closingTime=" + closingTime + ", order=" + order + ", resturantMenu=" + resturantMenu + "]";
	}

	
}
