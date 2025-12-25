package ApplyCoupons_Problem;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Product firstProduct = new Item("Smartphone", ProductType.ELECTRONICS, 1000);
        Product secondProduct = new Item("Jeans", ProductType.CLOTHING, 200);
        Product thirdProduct = new Item("Apples", ProductType.GROCERY, 100);

        List<Product> products = new ArrayList<>(List.of(firstProduct, secondProduct, thirdProduct));

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Total price after applying coupons: " + cart.computeTotalPrice());
    }
}
