package jtm.activity09;

import java.util.Objects;

/*- TODO #1
 * Implement Comparable interface with Order class
 * Hint! Use generic type of comparable items in form: Comparable<Order>
 * 
 * TODO #2 Override/implement necessary methods for Order class:
 * - public Order(String orderer, String itemName, Integer count) — constructor of the Order
 * - public int compareTo(Order order) — comparison implementation according to logic described below
 * - public boolean equals(Object object) — check equality of orders
 * - public int hashCode() — to be able to handle it in some hash... collection 
 * - public String toString() — string in following form: "ItemName: OrdererName: Count"
 * 
 * Hints:
 * 1. When comparing orders, compare their values in following order:
 *    - Item name
 *    - Customer name
 *    - Count of items
 * If item or customer is closer to start of alphabet, it is considered "smaller"
 * 
 * 2. When implementing .equals() method, rely on compareTo() method, as for sane design
 * .equals() == true, if compareTo() == 0 (and vice versa).
 * 
 * 3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
 * 
 */

public class Order implements Comparable<Order> {
	String customer; // Name of the customer 2
	String name; // Name of the requested item 1
	int count; // Count of the requested items 3

	public Order(String customer, String name, Integer count) {
		this.customer = customer;
		this.name = name;
		this.count = count;
	}

	@Override
	public int compareTo(Order order) {
		// TODO Auto-generated method stub

		if (!this.name.equals(order.name)) {
			return this.name.compareTo(order.name) > 0 ? 1 : -1;
		}

		if (!this.customer.equals(order.customer)) {
			return this.customer.compareTo(order.customer) > 0 ? 1 : -1;
		}

		if (this.count != order.count) {
			if (this.count > order.count) {
				return 1;
			} else {
				return -1;

			}
		}
		return 0;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return Objects.hash(customer, name, count);
	}

	@Override
	public boolean equals(Object order) {
		if (this == order)
			return true;
		if (order == null)
			return false;
		if (getClass() != order.getClass())
			return false;
		Order other = (Order) order;
		if (count != other.count)
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemName: " + name + "OrdererName: " + customer + "Count " + count;
	}
	
}
