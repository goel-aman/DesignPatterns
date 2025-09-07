package BookMyShowDesignPattern;

public class UPIPayment extends Payment {
    @Override
    Boolean processPayment() {
        // TODO Auto-generated method stub
        System.out.println("processing payment through UPI...");
        return true;
    }
}
