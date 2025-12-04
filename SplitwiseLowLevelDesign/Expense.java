package SplitwiseLowLevelDesign;
import java.util.List;

public class Expense {
    private String expenseId;
    private int amount;
    private Person paidBy;
    private String expenseName;
    private List<Person> splitBetween;

    Expense(String expenseId, int amount, Person paidBy, String expenseName, List<Person> splitBetween) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidBy = paidBy;
        this.expenseName = expenseName;
        this.splitBetween = splitBetween;
    }
}