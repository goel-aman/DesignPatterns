package ApplyCoupons_Problem;

public class Item extends Product{

    public Item(String productName, ProductType productType, int price) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }


    @Override
    public int getPrice() {
        return this.price;
    }
    

}
