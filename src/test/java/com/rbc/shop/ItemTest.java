package com.rbc.shop;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.rbc.shop.fruit.Apple;
import com.rbc.shop.fruit.Banana;
import com.rbc.shop.fruit.Lemon;
import com.rbc.shop.fruit.Peache;

public class ItemTest {

	
	@Test
	public void createApple() {
		// apples are being given away for free!
		assertNotNull(new Apple(0l));

		// an apple (or a bag of) is being sold for 10p
		assertNotNull(new Apple(10l));

		// apples are being sold for 2p per kg and the bag contains 25.5kg.
		assertNotNull(new Apple(2L, 25.5D));
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidApplePrice() {
		//test all the negative price/weight combinations
		assertNotNull(new Apple(-1));
		assertNotNull(new Apple(-1, 2.1));
		assertNotNull(new Apple(1, -2.2));
		assertNotNull(new Apple(-1, -2.3));
	}
	
	@Test
	public void createBanana() {
		assertNotNull(new Banana(10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidBananaPrice() {
		assertNotNull(new Banana(-1));
	}

	@Test
	public void createLemon() {
		assertNotNull(new Lemon(10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidLemonPrice() {
		assertNotNull(new Lemon(-1));
	}

	@Test
	public void createOrange() {
		assertNotNull(new Peache(10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidOrangePrice() {
		assertNotNull(new Lemon(-1));
	}

	@Test
	public void createPeache() {
		assertNotNull(new Peache(10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidPeachePrice() {
		assertNotNull(new Peache(-1));
	}
}
