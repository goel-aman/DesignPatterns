package InventoryManagementSystem;

enum PaymentStatus {
    paid,
    inProcess,
}

public class Payment {
    String paymentId;
    String orderId;

    public Payment() {

    }

    public boolean processPayment(int amount) {
        return true;
    } 
}
