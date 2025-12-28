package TemplateMethodDesignPattern;

public abstract class SendMoneyTemplate {
    public abstract void validateDetails();
    public abstract void initiateTransaction();
    public abstract void debitAccount();
    public abstract void creditAccount();


    public final void sendMoney() {
        validateDetails();

        initiateTransaction();

        debitAccount();

        creditAccount();
    }
}


