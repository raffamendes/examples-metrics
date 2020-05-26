package com.rmendes.springprometheus.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.rmendes.springprometheus.model.Order;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class OrderService {
	
	private final MeterRegistry meterRegistry;
	
	private Counter orderCount;
	
	public OrderService(MeterRegistry meterRegistry) {
		this.meterRegistry = meterRegistry;
	}
	
	@PostConstruct
	private void initCustomMetrics() {
		orderCount = Counter.builder("orders.all").tag("order", "all").description("The total number of orders").register(meterRegistry);
	}
	
	
	public Order saveOrder(Order newOrder) {
		this.orderCount.increment();
		return null;
	}

}
