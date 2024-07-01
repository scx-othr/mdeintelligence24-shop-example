package mdeintelligence;

/**
 * 
 * @generated
 */
public class OrderItem {

	/**
	 * * @opposite shop::mdeintelligence::OrderItem.order * @generated
	 */
	private Order order;

	/**
	 * * @opposite shop::mdeintelligence::OrderItem.article * @generated
	 * 
	 */

	private Article article;

	/**
	 * * @generated
	 * 
	 */

	private int quantity;

	/**
	 * @generated
	 */
	public Order getOrder() {
		return this.order;
	}

	/**
	 * @generated
	 */
	public void setOrder(Order newValue) {
		if (this.order != newValue) {
			Order oldValue = order;
			if (oldValue != null) {
				this.order = null;
				oldValue.removeFromItems(this);
			}
			this.order = newValue;
			if (newValue != null)
				newValue.addToItems(this);
		}
		// uniqueness of container semantics
	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public Article getArticle() {

		return this.article;

	}

	/**
	 * 
	 * @generated
	 * 
	 */

	public void setArticle(Article newValue) {

		this.article = newValue;

	}

	/**
	 * 
	 * 
	 * 
	 * getter for attribute quantity : int
	 * 
	 * @accessor quantity
	 * 
	 * @generated
	 * 
	 */

	public int getQuantity() {

		return this.quantity;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute quantity : int
	 * 
	 * @accessor quantity
	 * 
	 * @generated
	 * 
	 */

	public void setQuantity(int value) {

		this.quantity = value;

	}

}
