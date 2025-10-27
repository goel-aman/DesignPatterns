package AtmDesignProblem.CoinWithdrawal;

import java.util.List;
import java.util.ArrayList;

import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Note;
import AtmDesignProblem.Value;
import AtmDesignProblem.Withdraw;


public class WithdrawFiveHundred implements Withdraw{

    private Withdraw next;

    @Override
    public List<Note> withdraw(Integer amount, CashInventory cashInventory) {
        List<Note> notes = new ArrayList<>();
        
        int numberOfNotes = amount / 500;
        int notesInInventory = cashInventory.getNoteCount(Value.FiveHundred);
        int avalilableNotes = Math.min(numberOfNotes, notesInInventory);
        
        for(int i=0; i<avalilableNotes; i++) {
            notes.add(new Note(Value.FiveHundred));
        }

        List<Note> remainingNotes = 

        return notes;
    }
    
}
