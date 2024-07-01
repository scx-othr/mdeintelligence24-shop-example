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
public class Shop {

	static List<Object> observers = new ArrayList<Object>();

	/**
	 * * @opposite shop::mdeintelligence::Shop.articles * @generated
	 */
	private Set<Article> articles = new HashSet<Article>();

	/**
	 * * @opposite shop::mdeintelligence::Shop.customers * @generated
	 * 
	 */

	private Set<Customer> customers = new HashSet<Customer>();

	/**
	 * @generated
	 */
	public Set<Article> getArticles() {
		return (Set<Article>) Collections.unmodifiableSet(this.articles);
	}

	/**
	 * @generated
	 */
	public int sizeOfArticles() {
		return this.articles.size();
	}

	/**
	 * @generated
	 */
	public void addToArticles(Article newValue) {
		if (newValue != null && !this.articles.contains(newValue)) {
			this.articles.add(newValue);
			newValue.setShop(this);
		}
	}

	/**
	 * @generated
	 */
	public void removeFromArticles(Article value) {
		if (value != null && this.articles.contains(value)) {
			this.articles.remove(value);
			value.setShop(null);
		}
	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public Set<Customer> getCustomers() {

		return (Set<Customer>) Collections.unmodifiableSet(this.customers);

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public int sizeOfCustomers() {

		return this.customers.size();

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void addToCustomers(Customer newValue) {

		if (newValue != null && !this.customers.contains(newValue)) {

			this.customers.add(newValue);

			newValue.setShop(this);

		}

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void removeFromCustomers(Customer value) {

		if (value != null && this.customers.contains(value)) {

			this.customers.remove(value);

			value.setShop(null);

		}

	}

	/**
	 * Default Constructor
	 * 
	 * @generated
	 */
	public Shop() {
		observers.add(this);
		Shop.observers.add(this);
		Shop.observers.add(this);
	}

	/**
	 * org.eclipse.uml2.uml.internal.impl.CommentImpl@506c740d (body: If a customer
	 * with the same email already exists, do not add and return false. Otherwise,
	 * add and return true.)
	 * 
	 * @generated
	 */
	public boolean registerCustomers(Customer cust) {

		// Start of user code shop::mdeintelligence::Shop::registerCustomerscust
		// TODO should be implemented
		return false;
		// End of user code
	}

	/**
	 * 
	 * 
	 * 
	 * @generated
	 * 
	 */

	public Customer findCustomer(String email) {

		// Start of user code shop::mdeintelligence::Shop::findCustomeremail

		// TODO should be implemented

		return null;

		// End of user code

	}

	/**
	 * 
	 * 
	 * 
	 * @generated
	 * 
	 */

	public Article findArticle(String ean) {

		// Start of user code shop::mdeintelligence::Shop::findArticleean

		// TODO should be implemented

		return null;

		// End of user code

	}

}
