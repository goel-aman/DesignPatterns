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
    
}
