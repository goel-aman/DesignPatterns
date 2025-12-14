package InventoryManagementSystem;

enum CategoryType {
    Dairy,
    Grossary,
    Snacks,
    Furniture,
    Eyewear,
}

public class Item {
    String itemId;
    int price;
    CategoryType category;
    String itemName;

    public Item(String itemId, int price, CategoryType category, String itemName) {
        this.itemId = itemId;
        this.price = price;
        this.category = category;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }   
}
