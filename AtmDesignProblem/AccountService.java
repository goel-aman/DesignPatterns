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
}
