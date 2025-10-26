package AtmDesignProblem;
import java.util.*;
import java.util.Map;

public class AccountService {
    // account number, account
    Map<Integer, Account> accountMap;


    public AccountService() {
        this.accountMap = new HashMap<>();
    }

    public void addAccount(Account account) {
        accountMap.put(account.accountNumber, account);
    }

    public Account getAccount(Integer accountNumber) {
        return accountMap.get(accountNumber);
    }

    public void displayAccountDetails(Integer accountNumber) {
        Account account = accountMap.get(accountNumber);
        if(account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}
