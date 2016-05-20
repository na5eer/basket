package com.rbc.shop.fruit;

public class Lemon extends AbstractFruit{
	
	public Lemon(final long price){
		setPrice(price);
	}
	
	public Lemon(final long pricePerKg, final double weightInKg) {
		setPrice(pricePerKg, weightInKg);
	}
}

