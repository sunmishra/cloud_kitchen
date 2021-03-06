package com.serviceonepavilion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serviceonepavilion.entities.Customer;
import com.serviceonepavilion.entities.Menu;
import com.serviceonepavilion.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService menuService;

	@GetMapping("/menu/{resturantId}")
	public Menu menu(@PathVariable int resturantId) {
		Menu menu = menuService.getMenuByResturantId(resturantId);
		return menu;
	}
	
	@GetMapping("/menus")
	public List<Menu> getAllCustomer( ) {
		List<Menu> list = menuService.findAllMenu();
		return list;
	}

	@PostMapping("/menu")
	public Menu saveMenu(@RequestBody Menu menu) {
		return menuService.saveorUpdateMenu(menu);
	}
	
	@PutMapping("/menu")
	public Menu updateMenu(@RequestBody Menu menu) {
		return menuService.saveorUpdateMenu(menu);
	}

	@DeleteMapping("/menu/{menuId}")
	public int deleteMenu(@PathVariable int menuId) {
		return menuService.deleteMenu(menuId);
	}

}
