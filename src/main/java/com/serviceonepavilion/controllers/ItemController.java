package com.serviceonepavilion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serviceonepavilion.entities.Item;
import com.serviceonepavilion.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@GetMapping("/item/{itemId}")
	public Item getItem(@PathVariable int itemId) {
		Item item = itemService.getItemById(itemId);
		return item;
	}
	
	@GetMapping("/items")
	public List<Item> getAllItem() {
		List<Item> list = itemService.findAllItem();
		return list;
	}
	
	@PostMapping("/item")
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveorUpdateItem(item);
	}
	
	@DeleteMapping("/item/{itemId}")
	public int removeItem(@PathVariable int itemId) {
		return itemService.removeItem(itemId);
	}
	
}
