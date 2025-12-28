package TemplateMethodDesignPattern;

public class PayToVendor extends SendMoneyTemplate {
    @Override
    public void validateDetails() {
        System.out.println("Validating vendor details...");
    }

    @Override
    public void initiateTransaction() {
        System.out.println("Initiating transaction to vendor account...");
    }

    @Override
    public void debitAccount() {
        System.out.println("Debiting amount from your account...");
    }

    @Override
    public void creditAccount() {
        System.out.println("Crediting amount to vendor's account...");
    }
    
}
