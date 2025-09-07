package BookMyShowDesignPattern;


public class CardPayment extends Payment {
    @Override
    public Boolean processPayment(int amount) {
        System.out.println("Payment processed through card..." + amount);
        return true;
    }
}
