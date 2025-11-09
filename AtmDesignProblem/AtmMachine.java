package AtmDesignProblem;
import AtmDesignProblem.MoneyWithdrawal.*;

public class AtmMachine {
    private Integer accountNumber; 

    private State currentState;
    private AccountService accountService;
    private CashInventory cashInventory;

    public AtmMachine(AccountService accountService, CashInventory cashInventory) {
        this.accountService = accountService;
        this.cashInventory = cashInventory;
        currentState = new IdleState();
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public AccountService getAccountService() {
        return this.accountService;
    }

    public CashInventory getCashInventory() {
        return cashInventory;
    }
}