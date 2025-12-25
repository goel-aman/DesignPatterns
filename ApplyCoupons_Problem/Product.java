package ApplyCoupons_Problem;

enum ProductType {
    ELECTRONICS,
    GROCERY,
    CLOTHING
}

public abstract class Product {
    String productName;
    ProductType productType;
    int price;

    public abstract int getPrice();

    public ProductType getProductType() {
        return productType;
    }
}
