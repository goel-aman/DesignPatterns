package InventoryManagementSystem;

import StateDesignPattern.Inventory;

public class main {
    public static void main(String[] args) {

        // Selecting Warehouse Strategy..
        WarehouseStrategy strategy = new WarehouseStrategy(new NearestWarehouseStrategy());
        WarehouseManager warehouseManager = new WarehouseManager(strategy);

        // First Warehouse.
        Address eastDelhiWarehouseAddress = new Address("R - 23 ", "preet Vihar", "Delhi", City.Delh, 110092);
        Warehouse eastDelhi = new Warehouse("1232", eastDelhiWarehouseAddress, , "Laxmi Nagar Warehouse - East Delhi");
        
        // Create IventoryItem
        Item harvestBreadItem = new Item("6324", 55, CategoryType.Grossary, 
            "Harvest Bread"
        );

        InventoryItem harvestBread = new InventoryItem("434", harvestBreadItem, 10);

        InventoryManager manager = eastDelhi.getInventoryManager();

        // in this we are passing product Item Id...
        manager.addToInventory("", harvestBread, harvestBreadItem.getCategory());


        // Now adding Warehouse to WarehouseManager.
        warehouseManager.addWarehouse(eastDelhi);


        // Now we have the initial setup ready...
        // Now create a user..

        User amanUser = new User("23423", "aman goel");

        // user login into system...
        // now show products to him/her from nearest warehouse...

        warehouseManager.getWarehouse()
        
    }
}
