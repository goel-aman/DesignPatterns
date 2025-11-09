package AtmDesignProblem.CoinWithdrawal;

import java.util.List;

import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Note;
import AtmDesignProblem.Withdraw;
import AtmDesignProblem.Value;

public class WithdrawFifty implements Withdraw {

    private Withdraw next;

    public WithdrawFifty(Withdraw next) {
        this.next = next;
    }

    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, Value.Fifty);
        List<Note> remainingNotes = next.withdraw(amount - (Value.Fifty.getValue() *  notes.size()), cashInventory);

        for(Note note: remainingNotes) {
            notes.add(note);
        }
        
        return notes;
    }
    
}
