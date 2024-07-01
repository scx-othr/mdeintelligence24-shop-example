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
public class Order {

	static List<Object> observers = new ArrayList<Object>();

	/**
	 * * @opposite shop::mdeintelligence::Order.customer * @generated
	 */
	private Customer customer;

	/**
	 * * @opposite shop::mdeintelligence::Order.items * @generated
	 * 
	 */

	private Set<OrderItem> items = new HashSet<OrderItem>();

	/**
	 * * @generated
	 * 
	 */

	private String orderId;

	/**
	 * @generated
	 */
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * @generated
	 */
	public void setCustomer(Customer newValue) {
		if (this.customer != newValue) {
			Customer oldValue = customer;
			if (oldValue != null) {
				this.customer = null;
				oldValue.removeFromOrders(this);
			}
			this.customer = newValue;
			if (newValue != null)
				newValue.addToOrders(this);
		}
		// uniqueness of container semantics
	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public Set<OrderItem> getItems() {

		return (Set<OrderItem>) Collections.unmodifiableSet(this.items);

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public int sizeOfItems() {

		return this.items.size();

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void addToItems(OrderItem newValue) {

		if (newValue != null && !this.items.contains(newValue)) {

			this.items.add(newValue);

			newValue.setOrder(this);

		}

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void removeFromItems(OrderItem value) {

		if (value != null && this.items.contains(value)) {

			this.items.remove(value);

			value.setOrder(null);

		}

	}

	/**
	 * 
	 * 
	 * 
	 * getter for attribute orderId : String
	 * 
	 * @accessor orderId
	 * 
	 * @generated
	 * 
	 */

	public String getOrderId() {

		return this.orderId;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute orderId : String
	 * 
	 * @accessor orderId
	 * 
	 * @generated
	 * 
	 */

	public void setOrderId(String value) {

		this.orderId = value;

	}

	/**
	 * org.eclipse.uml2.uml.internal.impl.CommentImpl@6bdbd46d (body: If an order
	 * referring to the same article already exists, reuse that one updating the
	 * quantity.)
	 * 
	 * @generated
	 */
	public void addItem(OrderItem item) {

		// Start of user code shop::mdeintelligence::Order::addItemitem
		// TODO should be implemented

		// End of user code
	}

	/**
	 * 
	 * 
	 * 
	 * @generated
	 * 
	 */

	public double totalPrice() {

		// Start of user code shop::mdeintelligence::Order::totalPrice

		// TODO should be implemented

		return 0;

		// End of user code

	}

	/**
	 * 
	 * org.eclipse.uml2.uml.internal.impl.CommentImpl@5c44ee3d (body: Generate a
	 * random UUID for the
	 * orderId.)org.eclipse.uml2.uml.internal.impl.CommentImpl@640034bc (body:
	 * Generate a random UUID for the orderId.)
	 * 
	 * @generated
	 * 
	 */

	public Order() {

		observers.add(this);

		Order.observers.add(this);

		// Start of user code shop::mdeintelligence::Order::Order

		// TODO should be implemented

		// End of user code

	}

}
