package InventoryManagementSystem;
import java.util.*;

enum OrderStatus {
    Created,
    paymentPending,
    Paid,
    Cancelled,
}

public class Order {
    private String orderId;
    private String paymentId;
    private String invoiceId;
    private List<Item> item;
    private OrderStatus orderStatus;

    public Order(String orderId, List<Item> item) {
        this.orderId = orderId;
        this.item = item;
        this.paymentId = null;
        this.invoiceId = null;
        this.orderStatus = OrderStatus.Created;
    }
    
    public int computeTotalCost() {
        int sum = 0;
        int itemLength = item.size();

        for(int i=0; i<itemLength; i++) {
            sum = sum + item.get(i).getPrice();
        }

        return sum;
    }

}
