package com.rbc.shop.fruit;

import com.rbc.shop.Item;

public class Apple extends AbstractFruit implements Item {
		
	public Apple(final long price) {
		setPrice(price);
	}
	
	public Apple(final long pricePerKg, final double weightInKg) {
		setPrice(pricePerKg, weightInKg);
	}

}