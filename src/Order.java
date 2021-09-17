public class Order {
    private Customer customer;
    private ShoppingCart cart;
    private Payment payment;

    public Order(Customer customer, ShoppingCart cart, Payment payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" + "\n customer=" + customer + ",\n cart=" + cart + ",\n payment=" + payment + "\n}";
    }
}
