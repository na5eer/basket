package com.rbc.shop.fruit;

import com.rbc.shop.Item;

public abstract class AbstractFruit implements Item {

	private long price;
	
	public void setPrice(final long price) {
		if (price < 0){
			throw new IllegalArgumentException("Price of an item can not be less then zero.");
		}
		
		this.price = price;
	}
	
	public long getPrice() {
		return price;
	}
}
