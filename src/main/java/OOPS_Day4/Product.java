package OOPS_Day4;

public class Product {
    private double price;

    // Constructor
    public Product(double price) {
        this.price = price;
    }

    // Getter and setter for price variable
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded method for price getter based on quantity
    public double getPrice(int quantity) {
        // Assuming price is for single quantity
        return price * quantity;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Product object with price
        Product product = new Product(10.0);

        // Get and print the price
        System.out.println("Price for single quantity: " + product.getPrice());

        // Get and print the price for a specific quantity
        int quantity = 5;
        System.out.println("Price for " + quantity + " quantities: " + product.getPrice(quantity));
    }
}
