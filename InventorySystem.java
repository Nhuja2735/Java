class Product {
    private final String id;
    private final String name;
    private final double price;
    private int stock; // removed 'final'

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Add this method
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }
}

class Customer {
    private final String id;
    private final String name;
    private final String email;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}

class Order {
    private final String orderId;
    private final Customer customer;
    private final Product product;
    private final int quantity;
    private final boolean fulfilled;

    public Order(String orderId, Customer customer, Product product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.fulfilled = product.reduceStock(quantity);
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        if (fulfilled) {
            System.out.println("Order Status: Fulfilled");
        } else {
            System.out.println("Order Status: Failed (Not enough stock)");
        }
        System.out.println();
    }
}
public class InventorySystem {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product("P001", "Laptop", 800.0, 10);
        Product p2 = new Product("P002", "Smartphone", 500.0, 5);

        // Create a customer
        Customer c1 = new Customer("C001", "Nhuja Maharjan", "nhuja@email.com");

        // Place an order
        Order o1 = new Order("O001", c1, p1, 2);
        o1.printOrderDetails();

        // Try ordering more than stock
        Order o2 = new Order("O002", c1, p2, 6); // Only 5 in stock
        o2.printOrderDetails();
    }
}
