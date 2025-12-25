package ApplyCoupons_Problem;
import java.util.*;

public class ProductTypeCoupon extends CouponDecorator {
    private Product product;
    private int percentage;
    private static List<ProductType> applicableTypes = new ArrayList<>(Arrays.asList(ProductType.ELECTRONICS));

    public ProductTypeCoupon(Product product, int percentage) {
        this.product = product;
        this.productType = product.productType;
        this.percentage = percentage;
    }

    @Override
    public int getPrice() {
        if(applicableTypes.contains(product.getProductType())) {
            return product.getPrice() - (product.getPrice() * percentage / 100);
        } else {
            return product.getPrice();
        }
    }
    
}
