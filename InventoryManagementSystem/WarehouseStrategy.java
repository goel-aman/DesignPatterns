package InventoryManagementSystem;

public class WarehouseStrategy {
    WarehouseSelector selector;

    public WarehouseStrategy(WarehouseSelector selector) {
        this.selector = selector;
    }

    public Warehouse getWarehouse(Address address) {
        return selector.getWarehouse(address);
    }
}
