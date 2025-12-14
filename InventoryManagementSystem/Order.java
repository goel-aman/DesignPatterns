package InventoryManagementSystem;
import java.util.*;

enum OrderStatus {
    Created,
    paymentPending,
    Paid,
    Cancelled,
}

public class Order {
    String orderId;
    String paymentId;
    String invoiceId;
    List<Item> item;
    OrderStatus orderStatus;

    public Order(String orderId, List<Item> item) {
        this.orderId = orderId;
        this.item = item;
        this.paymentId = null;
        this.invoiceId = null;
        this.orderStatus = OrderStatus.Created;
    }
}
