package InventoryManagementSystem;
import java.util.List;
public class NearestWarehouseStrategy implements WarehouseSelector{

    @Override
    public Warehouse getWarehouse(Address address, List<Warehouse> warehouses) {
        int warehouseLength = warehouses.size();

        for(int i=0; i<warehouseLength; i++) {
            if(warehouses.get(i).location.getPinCode() == address.getPinCode()) {
                return warehouses.get(i);
            }
        }

        return new Warehouse(null, null, null);
    }

}
