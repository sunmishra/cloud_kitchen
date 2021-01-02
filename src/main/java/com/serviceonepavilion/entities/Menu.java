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


@Entity
@Table(name = "MENU_TABLE")
public class Menu {
	@Id
	@Column(name = "MENU_ID")
	//@GeneratedValue
	private int menuId;
	@Column(name = "CATEGORY")
	private String menuCategory;
	
	@OneToMany(/* mappedBy = "itemId", */ cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Item.class)
	private List<Item> itemList;
	
	@OneToOne(/* mappedBy = "resturantMenu", */ cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Resturant.class)
	private Resturant menu;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuCategory() {
		return menuCategory;
	}

	public void setMenuCategory(String menuCategory) {
		this.menuCategory = menuCategory;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public Resturant getMenu() {
		return menu;
	}

	public void setMenu(Resturant menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuCategory=" + menuCategory + ", itemList=" + itemList + ", menu=" + menu
				+ "]";
	}
	
	
	
}
