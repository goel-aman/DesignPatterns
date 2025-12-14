package InventoryManagementSystem;

public class Warehouse {
    String warehouseId;
    String warehouseName;
    Address location;
    InventoryManager inventoryManager;

    public Warehouse(String warehouseId, Address location, InventoryManager inventoryManager, String warehouseName) {
        this.warehouseId = warehouseId;
        this.location = location;
        this.inventoryManager = inventoryManager;
        this.warehouseName = warehouseName;
    }
}
