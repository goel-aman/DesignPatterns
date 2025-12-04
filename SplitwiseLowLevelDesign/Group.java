package SplitwiseLowLevelDesign;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class Group {
    int groupId;
    String groupName;
    List<Person> members;
    BalanceManager balanceManager;
    List<Expense> expenses;

    public Group(int groupId, String groupName, List<Person> members) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = members;
        this.balanceManager = new BalanceManager(members); 
        this.expenses = new ArrayList<>();
    }

    public static String generateUniqueId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public void addExpense(int amount, Person paidBy, List<Person> splitBetween) {
        expenses.add(new Expense(generateUniqueId(), amount, paidBy, groupName, splitBetween));
        balanceManager.paidByDivideBetween(amount, paidBy, splitBetween);
    }

    public void settleExpenses() {
        balanceManager.settle();
    }
}
