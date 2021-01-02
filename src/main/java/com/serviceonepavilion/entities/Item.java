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
@Table(name = "ITEM_TABLE")
public class Item {
	@Id
	@Column(name = "ITEM_ID")
	//@GeneratedValue
	private int itemId;
	@Column(name = "ITEM_NAME")
	private String itemName;
	@Column(name = "ITEM_CATEGORY")
	private String itemCategory;
	@Column(name = "itemPrice")
	private double price;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Menu.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "MENU_ID")
	private Menu mId;

	
	public Item() {
	}
	
	public Item(int itemId, String itemName, String itemCategory, double price, Menu mId) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.price = price;
		this.mId = mId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Menu getmId() {
		return mId;
	}

	public void setmId(Menu mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCategory=" + itemCategory + ", price="
				+ price + ", mId=" + mId + "]";
	}

	
}
