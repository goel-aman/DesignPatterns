package BookMyShowDesignPattern;

public abstract class Payment {
    int amount;

    abstract Boolean processPayment(int amount);
}
