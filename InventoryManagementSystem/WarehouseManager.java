package InventoryManagementSystem;
import java.util.*;

public class WarehouseManager {
    private Set<Warehouse> warehouses;
    private WarehouseStrategy warehouseStrategy;

    WarehouseManager(WarehouseStrategy strategy) {
        warehouses = new HashSet<>();
        this.warehouseStrategy = strategy;
    }

    public Warehouse getWarehouse(Address address) {
        List<Warehouse> listOfWarehouses = new ArrayList<>(warehouses);
        return warehouseStrategy.getWarehouse(address, listOfWarehouses);
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
    }
}
