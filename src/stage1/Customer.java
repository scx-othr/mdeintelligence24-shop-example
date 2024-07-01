package stage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders = new ArrayList<>();

    /*
     * Provided email must be a valid email address.
     */
    public Customer(String name, String email) {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

}