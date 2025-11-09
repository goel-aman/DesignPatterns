package AtmDesignProblem.CoinWithdrawal;
import java.util.ArrayList;
import java.util.List;

import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Note;
import AtmDesignProblem.Withdraw;
import AtmDesignProblem.Value;

public class WithdrawFive implements Withdraw  {

    private Withdraw next;

    public WithdrawFive(Withdraw next) {
        this.next = next;
    }

    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, Value.Five);
        List<Note> remainingNotes = next.withdraw(amount - notes.size() * Value.Five.getValue(), cashInventory);

        for(Note note: remainingNotes) {
            notes.add(note);
        }

        return notes;
    }

}
