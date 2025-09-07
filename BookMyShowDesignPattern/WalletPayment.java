package BookMyShowDesignPattern;

public class WalletPayment extends Payment {

    @Override
    Boolean processPayment(int amount) {
        // TODO Auto-generated method stub
        System.out.println("processing payment through Wallet..." + amount);
        return true;
    }
}
