package InventoryManagementSystem;
import java.util.*;
import StateDesignPattern.Inventory;

public class main {
    public static void main(String[] args) {

        // Selecting Warehouse Strategy..
        WarehouseStrategy strategy = new WarehouseStrategy(new NearestWarehouseStrategy());
        WarehouseManager warehouseManager = new WarehouseManager(strategy);

        // First Warehouse.
        Address eastDelhiWarehouseAddress = new Address("R - 23 ", "preet Vihar", "Delhi", City.Delhi, 110092);
        Warehouse eastDelhi = new Warehouse("1232", eastDelhiWarehouseAddress, "Laxmi Nagar Warehouse - East Delhi");
        
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
        Address userAddress = new Address("3rd floor J - 44","Vijay Chowk" , "Laxmi Nagar", City.Delhi, 110092);
        amanUser.addAddress(userAddress);
        // user login into system...
        // now show products to him/her from nearest warehouse...
        
        // User selects a address..// let say that is userAddress..

        Warehouse nearestWarehouse = warehouseManager.getWarehouse(userAddress);

        // show products in warehouse..
        List<InventoryItem> list = nearestWarehouse.getInventoryManager().inventoryList();
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).getItem().getItemName() + "and quanity is: " + list.get(i).getQuantity());
        }

        // now user will select desired item and add to cart..
        Cart userCart = new Cart("4223", "23423");
        userCart.addToCart(list.get(0).getItem());

        // once the cart is created... time to convert it into an order...
        OrderService orderService = new OrderService();

        Payment payment = new Payment();

        OrderRepository orderRepository = new OrderRepository();

        String orderId = orderService.placeOrder(userCart, payment, orderRepository);
        System.out.println("OrderId is: " + orderId);
    }
}
