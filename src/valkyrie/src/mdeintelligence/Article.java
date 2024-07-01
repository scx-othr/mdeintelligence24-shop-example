package mdeintelligence;

/**
 * 
 * @generated
 */
public class Article {

	/**
	 * * @opposite shop::mdeintelligence::Article.shop * @generated
	 */
	private Shop shop;

	/**
	 * * @generated
	 * 
	 */

	private String ean;

	/**
	 * * @generated
	 * 
	 */

	private String name;

	/**
	 * * @generated
	 * 
	 */

	private double currentPrice;

	/**
	 * * @generated
	 * 
	 */

	private int itemsInStock;

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
				oldValue.removeFromArticles(this);
			}
			this.shop = newValue;
			if (newValue != null)
				newValue.addToArticles(this);
		}
		// uniqueness of container semantics
	}

	/**
	 * 
	 * 
	 * 
	 * getter for attribute ean : String
	 * 
	 * @accessor ean
	 * 
	 * @generated
	 * 
	 */

	public String getEan() {

		return this.ean;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute ean : String
	 * 
	 * @accessor ean
	 * 
	 * @generated
	 * 
	 */

	public void setEan(String value) {

		this.ean = value;

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
	 * getter for attribute currentPrice : double
	 * 
	 * @accessor currentPrice
	 * 
	 * @generated
	 * 
	 */

	public double getCurrentPrice() {

		return this.currentPrice;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute currentPrice : double
	 * 
	 * @accessor currentPrice
	 * 
	 * @generated
	 * 
	 */

	public void setCurrentPrice(double value) {

		this.currentPrice = value;

	}

	/**
	 * 
	 * 
	 * 
	 * getter for attribute itemsInStock : int
	 * 
	 * @accessor itemsInStock
	 * 
	 * @generated
	 * 
	 */

	public int getItemsInStock() {

		return this.itemsInStock;

	}

	/**
	 * 
	 * 
	 * 
	 * setter for attribute itemsInStock : int
	 * 
	 * @accessor itemsInStock
	 * 
	 * @generated
	 * 
	 */

	public void setItemsInStock(int value) {

		this.itemsInStock = value;

	}

	/**
	 * org.eclipse.uml2.uml.internal.impl.CommentImpl@2a682612 (body: Provided ean
	 * must be a fully valid European Article Number according to the offical
	 * definition.)
	 * 
	 * @generated
	 */
	public Article(String ean, String name) {

		// Start of user code shop::mdeintelligence::Article::Articleeanname
		// TODO should be implemented

		// End of user code
	}

}
