package InventoryManagementSystem;
import java.util.UUID;

public class OrderService {
    public String placeOrder(Cart cart, Payment payment, OrderRepository orderRepository) {
        // create Order Id...
        String orderId = UUID.randomUUID().toString();
        Order order = new Order(orderId, cart.getCartItems());
        
        orderRepository.addOrderForUser(cart.getUserId(), order);

        boolean status = payment.processPayment(order.computeTotalCost());

        System.out.println("Order place successfully..");
            
        cart.clearCart();

        return orderId;
    }
}
