package com.rbc.shop;

import java.util.Collection;

/**
 * This class calculates the total cost of a basket of items.
 * 
 * Design notes:
 * 
 * Generally it is best to work with interfaces, so we would normally have a
 * pricer interface and a concrete classes that implement this interface.
 * 
 * However, as we have no additional requirements at this stage and there is no
 * need to bloat the code with additional code, the interface part is being
 * skipped. All we need is a single static method to calculate the price based
 * on our requirements.
 * 
 * We can in the future refactor this class to make it more sophisticated if the
 * requirements deem it.
 * 
 * Note: As we are pricing using longs, there is an upper limit of 2^63 for the
 * total value of a basket. However, it is a reasonably safe bet that we are not
 * going to hit this upper limit any time soon. The total value of all stock
 * markets in the world have a combined value less then 2^63.
 * 
 * Also we are not catering for concurrent operations at this stage, as it's
 * unclear how the class is going to be used. If needed we can add
 * locking/synchronization at the time this becomes a requirement.
 * 
 * 
 * @author nk
 *
 */

public class Pricer {

	/**
	 * Calculate total price for a given collection of items.
	 * 
	 * @param items
	 * @return long price
	 */
	public static long calculateTotalPrice(final Collection<Item> items) {

		if (items == null || items.isEmpty()) {
			return 0;
		}

		long totalPrice = 0;
		for (Item item : items) {
			totalPrice += item.getPrice();
		}

		if (totalPrice < 0) {
			throw new RuntimeException("The system is unable to calulate the total price.");
		}
		return totalPrice;
	}
	

/*
	// The below code demonstrates how the calculation can be simplified even
	// further in java 8 using lambdas. However, as java 8 is not widely
	// used in production environments, it has been commented out.

	public static long calculateTotalPrice(final Collection<Item> items) {
		long totalPrice = (items == null ? 0 : items.stream().mapToLong(s -> s.getPrice()).sum());

		if (totalPrice < 0) {
			throw new RuntimeException("The system is unable to calulate the total price.");
		}
		return totalPrice;
	}
*/

}
