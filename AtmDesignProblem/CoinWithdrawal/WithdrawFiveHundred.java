package AtmDesignProblem.CoinWithdrawal;

import java.util.List;
import java.util.ArrayList;

import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Note;
import AtmDesignProblem.Value;
import AtmDesignProblem.Withdraw;

public class WithdrawFiveHundred implements Withdraw {

    private Withdraw next;

    public WithdrawFiveHundred(Withdraw next) {
        this.next = next;
    }

    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, Value.FiveHundred);
        List<Note> remainingNotes = next.withdraw(amount - (Value.FiveHundred.getValue() *  notes.size()), cashInventory);

        for(Note note: remainingNotes) {
            notes.add(note);
        }

        return notes;
    }
    
}
