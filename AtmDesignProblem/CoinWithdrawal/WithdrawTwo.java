package AtmDesignProblem.CoinWithdrawal;
import java.util.*;
import AtmDesignProblem.Note;
import AtmDesignProblem.Withdraw;

public class WithdrawTwo implements AtmDesignProblem.Withdraw {

    private AtmDesignProblem.Withdraw next;

    public WithdrawTwo(Withdraw next) {
        this.next = next;
    }
    
    @Override
    public List<Note> withdraw(Integer amount, AtmDesignProblem.CashInventory cashInventory) {
        List<Note> notes = new ComputeAvailabeNotes().compute(amount, cashInventory, AtmDesignProblem.Value.Two);
        
        java.util.List<AtmDesignProblem.Note> remainingNotes = next.withdraw(amount - (AtmDesignProblem.Value.Two.getValue() *  notes.size()), cashInventory);
        
        for(AtmDesignProblem.Note note: remainingNotes) {
            notes.add(note);
        }

        return notes;
    }
    
}
