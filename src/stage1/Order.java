package stage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> items = new ArrayList<>();

    /*
     * Generate a random UUID for the orderId.
     */
    public Order() {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    public double totalPrice() {
        throw new UnsupportedOperationException();
    }

}