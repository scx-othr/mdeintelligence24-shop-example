package stage1;

public class Article {
    private String ean;
    private String name;
    private double currentPrice;
    private int itemsInStock;

    /*
     * Provided ean must be a valid European Article Number.
     */
    public Article(String ean, String name) {
        throw new UnsupportedOperationException();
    }

    public String getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

}