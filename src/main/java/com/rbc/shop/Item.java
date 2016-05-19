package com.rbc.shop;

public interface Item {

	/**
	 * Return the price of an item in the basic currency unit. In the UK this
	 * will be in pence.
	 * 
	 * Note, we are using the return type as long to give us a great deal of
	 * flexibility in the price range. Depending on the type of items being priced
	 * we could reduce this to int's or a short, which will reduce the memory
	 * foot print.
	 * 
	 * We could also use BigDecimal but this again would add additional memory
	 * requirements and additional code complexity. At this stage of the
	 * development it's best to keep things as simple as possible.
	 * 
	 * @return price of item as a long
	 */
	long getPrice();

}