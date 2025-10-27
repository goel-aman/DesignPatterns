package AtmDesignProblem;
import java.util.List;

public interface Withdraw {
    List<Note> withdraw(Integer amount, CashInventory cashInventory);
}