package StateDesignPattern;

public class Item {
    private int price;
    private int itemId;
    private String itemName;
    private Type itemType;

    public Item(int price, int itemId, String itemName, Type itemType) {
        this.price = price;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Type getItemType() {
        return itemType;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }
}
