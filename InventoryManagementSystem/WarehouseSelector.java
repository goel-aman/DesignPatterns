package InventoryManagementSystem;
import java.util.List;
public interface WarehouseSelector {
    public Warehouse getWarehouse(Address address, List<Warehouse> warehouses);
}
