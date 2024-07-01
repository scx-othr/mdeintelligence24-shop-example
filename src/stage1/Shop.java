package stage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Shop {
    private List<Article> articles = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public List<Article> getArticles() {
        return Collections.unmodifiableList(articles);
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    /*
     * If a customer with the same email already exists, do not add and return
     * false. Otherwise, add and return true.
     */
    public boolean registerCustomer(Customer customer) {
        throw new UnsupportedOperationException();
    }

    public Optional<Customer> findCustomer(String email) {
        throw new UnsupportedOperationException();
    }

    public Optional<Article> findArticle(String ean) {
        throw new UnsupportedOperationException();
    }

}