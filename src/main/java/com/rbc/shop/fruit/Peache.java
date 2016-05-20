package com.rbc.shop.fruit;

import com.rbc.shop.Item;

public class Peache extends AbstractFruit implements Item {

	public Peache(final long price){
		setPrice(price);
	}
	
	public Peache(final long pricePerKg, final double weightInKg) {
		setPrice(pricePerKg, weightInKg);
	}
}
