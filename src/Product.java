public class Product {
    private final String name;
    private int discount;
    private int price;
    private int weight;
    private final ProductType type;

    public Product(String name, int price, ProductType type, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    public int getPrice() {
        int shippingCost = type.getShippingCost(weight);
        return Math.round((1 - discount) * price) + shippingCost;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", type=" + type + ", weight=" + weight + '}';
    }
}
