package stage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Order {
    private String orderId;
    private List<OrderItem> items = new ArrayList<>();

    /*
     * Generate a random UUID for the orderId.
     */
    public Order() {
        // prompt: implement constructor taking into consideration the comment above
        this.orderId = UUID.randomUUID().toString();
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    /*
     * If an order referring to the same article already exists,
     * reuse that one updating the quantity.
     */
    public void addItem(OrderItem orderItem) {
        // prompt: implement addItem taking into consideration the comment above
        for (OrderItem item : this.items) {
            if (item.getArticle().equals(orderItem.getArticle())) {
                item.setQuantity(item.getQuantity() + orderItem.getQuantity());
                return;
            }
        }
        this.items.add(orderItem);
    }

    public double totalPrice() {
        double total = 0.0;
        for (OrderItem item : this.items) {
            total += item.getArticle().getCurrentPrice() * item.getQuantity();
        }
        return total;
    }

}