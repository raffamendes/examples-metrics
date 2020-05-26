package com.rmendes.springprometheus.model;

public enum OrderStatus {
	
	PLACED(1), VOID(2), DISPATCHED(3), REFUSED(4);
	
	private final int value;
	
	private OrderStatus(int value) {
		this.value = value;
	}
	
	public int getValor() {
		return value;
	}

}
