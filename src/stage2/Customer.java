package stage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders = new ArrayList<>();

    // added by Copilot
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    /*
     * Provided email must be a valid email address.
     */
    public Customer(String name, String email) {
        // prompt: implement constructor taking into consideration the comment above
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    /*
     * For every item of the order, check if enough items are available in stock.
     * If so, add to orders and update the items in stock. Return whether order was added.
     */
    public boolean placeOrder(Order order) {
        // prompt: implement placeOrder taking into consideration the comment above
        for (OrderItem item : order.getItems()) {
            Article article = item.getArticle();
            if (article.getItemsInStock() < item.getQuantity()) {
                return false; // Not enough items in stock
            }
        }

        // If we reach here, it means there are enough items in stock for all order items
        for (OrderItem item : order.getItems()) {
            Article article = item.getArticle();
            article.setItemsInStock(article.getItemsInStock() - item.getQuantity());
        }

        // Add the order to the orders list
        orders.add(order);

        return true;
    }

}