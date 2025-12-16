package InventoryManagementSystem;
import java.util.*;

public class OrderRepository {
    // userId, Set Of Orders
    Map<String, Set<Order>> userOrders;

    public OrderRepository() {
        userOrders = new HashMap<>();
    }

    public void addOrderForUser(String userId, Order order) {
        userOrders.computeIfAbsent(userId, k -> new HashSet()).add(order);
    }

    public List<Order> fetchOrderListForUser(String userId) {
        Set<Order> orders = userOrders.get(userId);
        
        if(orders == null) {
            return Collections.emptyList();
        }

        List<Order> ordersList = new ArrayList<>(orders);
        return ordersList;
    }
}
