package BookMyShowDesignPattern;


public class CardPayment extends Payment {
    @Override
    public Boolean processPayment() {
        System.out.println("Payment processed through card...");
        return true;
    }
}
