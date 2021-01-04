package com.serviceonepavilion.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MENU_TABLE")
public class Menu {
	@Id
	@Column(name = "MENU_ID")
	//@GeneratedValue
	private int menuId;
	@Column(name = "CATEGORY")
	private String menuCategory;
	
	@OneToMany( mappedBy = "menuId",  cascade = CascadeType.ALL )
	private List<Item> itemList;
	
//	@OneToOne( mappedBy = "resturantMenu",  cascade = CascadeType.ALL )
//	private Resturant menu;

	

	
		
}
