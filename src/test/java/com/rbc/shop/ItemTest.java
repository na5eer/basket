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
		assertNotNull(new Apple(10));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void invalidApplePrice() {
		assertNotNull(new Apple(-1));
	}
	
	@Test
	public void createBanana() {
		assertNotNull(new Banana(10));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void invalidBananaPrice() {
		assertNotNull(new Banana(-1));
	}
	
	@Test
	public void createLemon() {
		assertNotNull(new Lemon(10));
	}
	@Test (expected=IllegalArgumentException.class)
	public void invalidLemonPrice() {
		assertNotNull(new Lemon(-1));
	}
	
	@Test
	public void createOrange() {
		assertNotNull(new Peache(10));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void invalidOrangePrice() {
		assertNotNull(new Lemon(-1));
	}
	
	@Test
	public void createPeache() {
		assertNotNull(new Peache(10));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void invalidPeachePrice() {
		assertNotNull(new Peache(-1));
	}
	
}
