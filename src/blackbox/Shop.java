import java.util.*;

// Article class
class Article {
    private String ean;
    private String name;
    private double price;
    private int stock;

    public Article(String ean, String name, double price, int stock) {
        if (!isValidEAN(ean)) {
            throw new IllegalArgumentException("Invalid EAN");
        }
        this.ean = ean;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new IllegalArgumentException("Not enough stock available");
        }
        stock -= quantity;
    }

    private boolean isValidEAN(String ean) {
        // Implement EAN validation logic here (length, numeric checks, etc.)
        return ean != null && ean.matches("\\d{13}");
    }
}

// Customer class
class Customer {
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    private boolean isValidEmail(String email) {
        // Basic email validation
        return email != null && email.contains("@");
    }
}

// OrderItem class
class OrderItem {
    private int quantity;
    private Article article;

    public OrderItem(Article article, int quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Order class
class Order {
    private UUID orderId;
    private List<OrderItem> orderItems;

    public Order() {
        this.orderId = UUID.randomUUID();
        this.orderItems = new ArrayList<>();
    }

    public UUID getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getQuantity() * item.getArticle().getPrice();
        }
        return total;
    }

    public void addOrderItem(Article article, int quantity) {
        // Check existing order items for the same article
        for (OrderItem item : orderItems) {
            if (item.getArticle().getEan().equals(article.getEan())) {
                item = new OrderItem(article, item.getQuantity() + quantity);
                return;
            }
        }
        // Create new order item if none found
        orderItems.add(new OrderItem(article, quantity));
    }
}

// Shop class
class Shop {
    private Map<String, Customer> customers;
    private Map<String, Article> articles;

    public Shop() {
        this.customers = new HashMap<>();
        this.articles = new HashMap<>();
    }

    public void registerCustomer(String name, String email) {
        if (customers.containsKey(email)) {
            throw new IllegalArgumentException("Customer with this email already exists");
        }
        Customer customer = new Customer(name, email);
        customers.put(email, customer);
    }

    public Customer retrieveCustomerByEmail(String email) {
        return customers.get(email);
    }

    public void addArticle(String ean, String name, double price, int stock) {
        if (articles.containsKey(ean)) {
            throw new IllegalArgumentException("Article with this EAN already exists");
        }
        Article article = new Article(ean, name, price, stock);
        articles.put(ean, article);
    }

    public Article retrieveArticleByEAN(String ean) {
        return articles.get(ean);
    }
}
