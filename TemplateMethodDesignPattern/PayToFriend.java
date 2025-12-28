package TemplateMethodDesignPattern;

public class PayToFriend extends SendMoneyTemplate {

    @Override
    public void validateDetails() {
        System.out.println("Validating friend details..");
    }

    @Override
    public void initiateTransaction() {
        System.out.println("Initiating transaction to friend account...");
    }

    @Override
    public void debitAccount() {
        System.out.println("Debiting amount from your account...");
    }

    @Override
    public void creditAccount() {
        System.out.println("Crediting amount to friend's account...");
    }
}
