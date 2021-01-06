package com.serviceonepavilion.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
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
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MENU_ID")
	@JsonManagedReference
//	@JsonIgnore
	private Menu menuId;

	

}
