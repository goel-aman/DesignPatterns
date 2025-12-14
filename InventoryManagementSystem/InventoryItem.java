package InventoryManagementSystem;

public class InventoryItem {
    String inventoryId;
    Item item;
    int quantity;

    public InventoryItem(String inventoryId, Item item, int quantity) {
        this.inventoryId = inventoryId;
        this.item = item;
        this.quantity = quantity;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void incrementQuanity() {
        this.quantity = quantity + 1;
    }

    public void decrementQuantity() {
        if(quantity > 0) {
            this.quantity = quantity - 1;
        }
    }
}
