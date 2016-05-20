package com.rbc.shop.fruit;

public class Banana extends AbstractFruit {
	
	public Banana(final long price) {
		setPrice(price);
	}
	
	public Banana(final long pricePerKg, final double weightInKg) {
		setPrice(pricePerKg, weightInKg);
	}
}

