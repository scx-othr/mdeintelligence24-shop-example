package stage2;

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
        // prompt: implement registerCustomer taking into consideration the comment above
        for (Customer existingCustomer : customers) {
            if (existingCustomer.getEmail().equals(customer.getEmail())) {
                return false; // A customer with the same email already exists
            }
        }

        // If we reach here, it means no customer with the same email exists
        customers.add(customer);
        return true;
    }

    public Optional<Customer> findCustomer(String email) {
        // prompt: implement findCustomer
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return Optional.of(customer);
            }
        }
        return Optional.empty();
    }

    public Optional<Article> findArticle(String ean) {
        // prompt: implement findArticle
        for (Article article : articles) {
            if (article.getEan().equals(ean)) {
                return Optional.of(article);
            }
        }
        return Optional.empty();
    }

}