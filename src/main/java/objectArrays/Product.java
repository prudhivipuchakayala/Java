package objectArrays;


public class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;

    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        return Double.compare(this.price, otherProduct.price);
    }
}
