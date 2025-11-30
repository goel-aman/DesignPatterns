package SplitwiseLowLevelDesign;
import java.util.List;

public class Group {
    int groupId;
    String groupName;
    List<Person> members;
    BalanceManager balanceManager;

    public Group(int groupId, String groupName, List<Person> members) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = members;
        this.balanceManager = new BalanceManager(members); 
    }

    public void addExpense(int amount, Person paidBy, List<Person> splitBetween) {
        balanceManager.paidByDivideBetween(amount, paidBy, splitBetween);
    }

    public void settleExpenses() {
        balanceManager.settle();
    }
}
