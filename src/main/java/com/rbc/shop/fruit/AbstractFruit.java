package com.rbc.shop.fruit;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.rbc.shop.Item;

/**
 * We have a number of fruit objects to implement, there are several options to
 * model these objects in our system. For example we could have single generic
 * object to represent all of them and use some label to distinguish between
 * them, this will reduce the amount of code in the system. However, since
 * objects like Apple, Banana, Lemon, etc.. are real tangible object with unique
 * properties it's best they have a concrete classes to represent them.
 * 
 * This abstract class implements the common elements of a Fruit Item.
 */

public abstract class AbstractFruit implements Item {

	private long itemPrice;

	public long getPrice() {
		return itemPrice;
	}
	
	public void setPrice(long price) {
		if (price < 0) {
			throw new IllegalArgumentException("Negative prices are invalid.");
		}
		itemPrice = price;
	}

	public void setPrice(final long pricePerKg, final double weightInKg) {
		long price = calcPrice(pricePerKg, weightInKg);
		setPrice(price);
	}
	
	//default method used to calculate the price.
	private long calcPrice(final long pricePerKg, double weightInKg) {
		if (pricePerKg < 0 || weightInKg <= 0) {
			throw new IllegalArgumentException("invalid price/weight {" + pricePerKg + ", " + weightInKg + "}");
		}

		// use the BigDecimal class to accurately calculate the price.
		BigDecimal price = BigDecimal.valueOf(pricePerKg).multiply(BigDecimal.valueOf(weightInKg)).setScale(0,
				RoundingMode.HALF_UP);

		return price.longValue();
	}
}
