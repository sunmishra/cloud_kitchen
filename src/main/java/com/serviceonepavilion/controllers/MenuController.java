package com.serviceonepavilion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serviceonepavilion.entities.Menu;
import com.serviceonepavilion.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@GetMapping("/getMenu/{menuId}")
	public Menu getMenu(@PathVariable int menuId) {
		Menu menu = menuService.getMenuById(menuId);
		return menu;
	}
	
	@GetMapping("/getAllMenu")
	public List<Menu> getAllMenu() {
		List<Menu> list = menuService.findAllMenu();
		return list;
	}
	
	@PostMapping("/postMenu")
	public Menu saveMenu(@RequestBody Menu menu) {
		return menuService.saveorUpdateMenu(menu);
	}
	
	@DeleteMapping("/removeMenu/{menuId}")
	public int removeMenu(@PathVariable int menuId) {
		return menuService.removeMenu(menuId);
	}
	
}
