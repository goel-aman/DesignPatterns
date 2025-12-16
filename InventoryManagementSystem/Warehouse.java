package InventoryManagementSystem;

public class Warehouse {
    String warehouseId;
    String warehouseName;
    Address location;
    InventoryManager inventoryManager;

    public Warehouse(String warehouseId, Address location, String warehouseName) {
        this.warehouseId = warehouseId;
        this.location = location;
        this.inventoryManager = new InventoryManager();
        this.warehouseName = warehouseName;
    }

    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }

    public void setInventoryManager(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }
}
