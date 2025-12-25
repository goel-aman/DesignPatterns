package ApplyCoupons_Problem;
import java.util.*;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart(List<Product> products) {
        for(Product product : products) {
            products.add(new PercentageProductCoupon(new ProductTypeCoupon(product, 5), 10));
        }
    }

    public int computeTotalPrice() {
        int total = 0;
        for(Product product: products) {
            total += product.getPrice();
        }

        return total;
    }
}
