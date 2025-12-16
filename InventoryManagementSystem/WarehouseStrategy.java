package InventoryManagementSystem;
import java.util.*;
public class WarehouseStrategy {
    WarehouseSelector selector;

    public WarehouseStrategy(WarehouseSelector selector) {
        this.selector = selector;
    }

    public Warehouse getWarehouse(Address address, List<Warehouse> warehouses) {
        return selector.getWarehouse(address, warehouses);
    }
}
