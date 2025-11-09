package AtmDesignProblem.CoinWithdrawal;

import java.util.List;

import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Note;
import AtmDesignProblem.Withdraw;

public class WithdrawOne implements Withdraw  {

    private Withdraw next;

    public WithdrawOne(Withdraw next) {
        this.next = next;
    }

    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, AtmDesignProblem.Value.One);
        
        if(next != null) {
            List<Note> remainingNotes = next.withdraw(amount - (AtmDesignProblem.Value.One.getValue() *  notes.size()), cashInventory);
            
            for(Note note: remainingNotes) {
                notes.add(note);
            }
        }
        
        return notes;
    }
    
}
