
//import java.util.HashMap;
import java.util.Map;
// import static ProductType.PHYSICAL;
// import static ProductType.DIGITAL;

public class Catalogue {
    public final static int SHIPPING_RATE = 5;

    private static Map<String, Product> productMap = Map.of("Electric Toothbrush",
            new Product("Electric Toothbrush", 1090, ProductType.PHYSICAL, 400), "Baby Alarm",
            new Product("Baby Alarm", 3500, ProductType.PHYSICAL, 400));
    // private static map<String, Product> productMap = new HashMap<>();

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }

}
