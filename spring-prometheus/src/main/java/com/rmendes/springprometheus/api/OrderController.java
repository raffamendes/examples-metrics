package com.rmendes.springprometheus.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmendes.springprometheus.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@GetMapping
	public String hello() {
		return "hello";
	}
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Order createOrder(@RequestBody Order newOrder) {
		return newOrder;
	}
	
}
