package stage2;

public class OrderItem {
    private Article article;
    private int quantity;

    public Article getArticle() {
        return article;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
