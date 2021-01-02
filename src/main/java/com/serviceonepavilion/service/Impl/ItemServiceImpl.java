package com.serviceonepavilion.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceonepavilion.entities.Item;
import com.serviceonepavilion.repository.ItemRepository;
import com.serviceonepavilion.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	public Item saveorUpdateItem(Item item) {
		Item customerItem = null;
		if (!itemRepository.existsById(item.getItemId())) {
			customerItem = itemRepository.save(item);
		} else
			customerItem = itemRepository.update();
		return customerItem;
	}

	public int removeItem(int id) {
		itemRepository.deleteById(id);
		return id;
	}

	public Item getItemById(int id) {
		return itemRepository.findById(id).get();
	}

	public List<Item> findAllItem() {
		List<Item> listItem = itemRepository.findAll();
		return listItem;
	}

}
