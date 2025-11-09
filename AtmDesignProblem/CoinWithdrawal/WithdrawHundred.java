package AtmDesignProblem.CoinWithdrawal;
import AtmDesignProblem.Note;
import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Value;
import AtmDesignProblem.Withdraw;
import java.util.List;
import java.util.ArrayList;

public class WithdrawHundred implements Withdraw {
    
    private Withdraw next;

    public WithdrawHundred(Withdraw next) {
        this.next = next;
    }


    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, Value.Hundred);
        List<Note> remainingNotes = next.withdraw(amount - (Value.Hundred.getValue() *  notes.size()), cashInventory);

        for(Note note: remainingNotes) {
            notes.add(note);
        }

        return notes;
    }
}
