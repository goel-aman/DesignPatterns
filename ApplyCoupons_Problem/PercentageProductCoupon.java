package ApplyCoupons_Problem;

public class PercentageProductCoupon extends CouponDecorator {
    private Product product;
    private int percentage;

    public PercentageProductCoupon(Product product, int percentage) {
        this.product = product;
        this.productName = product.productName;
        this.productType = product.productType;
        this.percentage = percentage;
    }

    @Override
    public int getPrice() {
        return product.getPrice() - (product.getPrice() * percentage / 100);
    }
    
}
