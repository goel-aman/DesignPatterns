package AtmDesignProblem.CoinWithdrawal;

import java.util.List;

import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Note;
import AtmDesignProblem.Withdraw;

public class WithdrawTwenty implements Withdraw {

    private Withdraw next;

    public WithdrawTwenty(Withdraw next) {
        this.next = next;
    }

    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, AtmDesignProblem.Value.Twenty);
        List<Note> remainingNotes = next.withdraw(amount - (AtmDesignProblem.Value.Twenty.getValue() *  notes.size()), cashInventory);

        for(Note note: remainingNotes) {
            notes.add(note);
        }

        return notes;        
    }
    
}
