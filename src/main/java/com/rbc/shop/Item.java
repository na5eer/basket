package com.rbc.shop;

public interface Item {

	/**
	 * Return the price of an item in the basic currency unit. In the UK this
	 * will be in pence.
	 * 
	 * Note, we are using the return type as a long to give us flexibility.
	 * Depending on the type of items being priced we could reduce this to int
	 * or a short, which will reduce the memory foot print.
	 * 
	 * We could also use BigDecimal but this again would add additional memory
	 * requirements and additional code complexity. At this stage of the
	 * development it's best to keep things as simple as possible.
	 * 
	 * @return price of item as a long
	 */
	long getPrice();
	
	void setPrice(long price);
	
}