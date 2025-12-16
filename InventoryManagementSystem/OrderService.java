package InventoryManagementSystem;
import java.util.UUID;

public class OrderService {
    public String placeOrder(Cart cart, Payment payment) {
        // create Order Id...
        String orderId = UUID.randomUUID().toString();
        Order order = new Order(orderId, cart.getCartItems());
        
        boolean status = payment.processPayment(order.computeTotalCost());

        cart.clearCart();

        return orderId;
    }
}
