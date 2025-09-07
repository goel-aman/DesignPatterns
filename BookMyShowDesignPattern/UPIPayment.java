package BookMyShowDesignPattern;

public class UPIPayment extends Payment {
    @Override
    Boolean processPayment(int amount) {
        // TODO Auto-generated method stub
        System.out.println("processing payment through UPI..." + amount);
        return true;
    }
}
