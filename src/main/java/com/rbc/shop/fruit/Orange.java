package com.rbc.shop.fruit;

import com.rbc.shop.Item;

public class Orange extends AbstractFruit implements Item {

	public Orange(final long price) {
		setPrice(price);
	}
	
	public Orange(final long pricePerKg, final double weightInKg) {
		setPrice(pricePerKg, weightInKg);
	}
}

