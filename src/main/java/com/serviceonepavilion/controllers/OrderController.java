package com.serviceonepavilion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serviceonepavilion.entities.Order;
import com.serviceonepavilion.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/getOrder/{itemId}")
	public Order getOrder(@PathVariable int orderId) {
		Order order = orderService.getOrderById(orderId);
		return order;
	}
	
	@GetMapping("/getAllOrder")
	public List<Order> getAllOrder() {
		List<Order> list = orderService.findAllOrder();
		return list;
	}
	
	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveorUpdateOrder(order);
	}
	
	@DeleteMapping("/removeOrder/{orderId}")
	public int removeOrder(@PathVariable int orderId) {
		return orderService.removeOrder(orderId);
	}
	
}
