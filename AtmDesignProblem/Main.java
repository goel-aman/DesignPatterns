package AtmDesignProblem;

import java.util.Map;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // create an account first...
        Account account = new Account(1234, 12002010, 10000, "aman goel");

        // machine cash Inventory..
        Map<Value, Integer> cashInventoryMap = new HashMap<Value,Integer>();
        CashInventory cashInventory = new CashInventory(cashInventoryMap);

        // creating account service.
        AccountService accountService = new AccountService();
        
        // addding the account to accountService..
        accountService.addAccount(account);


        AtmMachine atmMachine = new AtmMachine(accountService, cashInventory);

        // adding money to machine..
        atmMachine.getCashInventory().incrementNoteCount(Value.FiveHundred, 10);

        // let start...
        atmMachine.getCurrentState().enterAccountDetails(12002010, atmMachine);

        // withdraw Money Option Clicked...
        atmMachine.getCurrentState().withdrawMoneyClicked(atmMachine);

        // now withdrawing money..
        List<Note> notes = atmMachine.getCurrentState().withdrawMoney(atmMachine, 500);
        
    }
}
