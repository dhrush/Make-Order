import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // Product toothbrush = new Product("Electric Toothbrush", 1090);
        // Product babyAlarm = new Product("Baby Alarm Clock", 3500);

        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");

        cart.addLineItem(new LineItem(babyAlarm, 1));
        cart.addLineItem(new LineItem(toothbrush, 2));
        // System.out.println(cart);
        System.out.println(cart.getTotalCost());

        Customer johnDoe = new Customer("John Doe", 5402000011112222L);
        Optional<Order> order = johnDoe.checkout(cart);
        System.out.println(order);

    }
}
