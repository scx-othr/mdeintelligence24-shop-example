package mdeintelligence;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

/**
 * 
 * @generated
 */
public class Customer {

	static List<Object> observers = new ArrayList<Object>();

	/**
	 * * @opposite shop::mdeintelligence::Customer.shop * @generated
	 */
	private Shop shop;

	/**
	 * * @opposite shop::mdeintelligence::Customer.orders * @generated
	 * 
	 */

	private Set<Order> orders = new HashSet<Order>();

	/**
	 * * @generated
	 * 
	 */

	private String name;

	/**
	 * * @generated
	 * 
	 */

	private String email;

	/**
	 * @generated
	 */
	public Shop getShop() {
		return this.shop;
	}

	/**
	 * @generated
	 */
	public void setShop(Shop newValue) {
		if (this.shop != newValue) {
			Shop oldValue = shop;
			if (oldValue != null) {
				this.shop = null;
				oldValue.removeFromCustomers(this);
			}
			this.shop = newValue;
			if (newValue != null)
				newValue.addToCustomers(this);
		}
		// uniqueness of container semantics
	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public Set<Order> getOrders() {

		return (Set<Order>) Collections.unmodifiableSet(this.orders);

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public int sizeOfOrders() {

		return this.orders.size();

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void addToOrders(Order newValue) {

		if (newValue != null && !this.orders.contains(newValue)) {

			this.orders.add(newValue);

			newValue.setCustomer(this);

		}

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void removeFromOrders(Order value) {

		if (value != null && this.orders.contains(value)) {

			this.orders.remove(value);

			value.setCustomer(null);

		}

	}

	/**
	 * 
	 * 
	 * 
	 * getter for attribute name : String
	 * 
	 * @accessor name
	 * 
	 * @generated
	 * 
	 */

	public String getName() {

		return this.name;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute name : String
	 * 
	 * @accessor name
	 * 
	 * @generated
	 * 
	 */

	public void setName(String value) {

		this.name = value;

	}

	/**
	 * 
	 * 
	 * 
	 * getter for attribute email : String
	 * 
	 * @accessor email
	 * 
	 * @generated
	 * 
	 */

	public String getEmail() {

		return this.email;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute email : String
	 * 
	 * @accessor email
	 * 
	 * @generated
	 * 
	 */

	public void setEmail(String value) {

		this.email = value;

	}

	/**
	 * org.eclipse.uml2.uml.internal.impl.CommentImpl@e3cf31c (body: Provided email
	 * must be a valid email address.)
	 * 
	 * @generated
	 */
	public Customer(String name, String email) {

		observers.add(this);
		Customer.observers.add(this);
		// Start of user code shop::mdeintelligence::Customer::Customernameemail
		// TODO should be implemented

		// End of user code
	}

	/**
	 * 
	 * org.eclipse.uml2.uml.internal.impl.CommentImpl@3ce17011 (body: For every item
	 * of the order, check if enough
	 * 
	 * items are available in stock. If so, add to orders and update the items in
	 * stock. Return whether order was added.)
	 * 
	 * @generated
	 * 
	 */

	public boolean placeOrder(Order order) {

		// Start of user code shop::mdeintelligence::Customer::placeOrderorder

		// TODO should be implemented

		return false;

		// End of user code

	}

}
