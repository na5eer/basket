package com.rbc.shop;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.rbc.shop.fruit.Apple;
import com.rbc.shop.fruit.Banana;
import com.rbc.shop.fruit.Lemon;
import com.rbc.shop.fruit.Orange;
import com.rbc.shop.fruit.Peache;

public class PricerTest {

	@Test
	public void priceNullBasket() {
		assertEquals(0, Pricer.calculateTotalPrice(null));
	}

	@Test
	public void priceEmptyBasket() {
		long totalCost = Pricer.calculateTotalPrice(new ArrayList<Item>());
		assertEquals(0, totalCost);
	}

	@Test
	public void priceSimpleBasket() {

		List<Item> basket = new ArrayList<Item>();
		basket.add(new Apple(10));
		basket.add(new Orange(11));
		basket.add(new Banana(12));
		basket.add(new Lemon(13));
		basket.add(new Peache(14));

		long totalCost = Pricer.calculateTotalPrice(basket);
		assertEquals((10 + 11 + 12 + 13 + 14), totalCost);
	}

	@Test
	public void priceMixedBasket() {

		List<Item> basket = new ArrayList<Item>();
		basket.add(new Apple(10, 3.25)); // this equals 32.5 pence, which needs
											// to be rounded to 33 pence.
		basket.add(new Apple(10));
		basket.add(new Orange(11));
		basket.add(new Banana(12));
		basket.add(new Peache(14));
		basket.add(new Apple(10));
		basket.add(new Lemon(13));
		basket.add(new Peache(109, 13.473)); // this equals 32.2 pence, which
												// rounded will be 32 pence.

		long totalCost = Pricer.calculateTotalPrice(basket);
		assertEquals((33 + 10 + 11 + 12 + 14 + 10 + 13 + 1469), totalCost, 0);
	}

	@Test(expected = RuntimeException.class)
	public void priceItemWithMaxVaue() {

		List<Item> basket = new ArrayList<Item>();
		basket.add(new Apple(Long.MAX_VALUE));
		basket.add(new Orange(1));

		Pricer.calculateTotalPrice(basket);
	}

}
