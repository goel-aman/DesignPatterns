package AtmDesignProblem.CoinWithdrawal;
import AtmDesignProblem.CashInventory;
import AtmDesignProblem.Value;
import AtmDesignProblem.Note;
import java.util.*;

public class ComputeAvailabeNotes {
    public List<Note> compute(Integer amount, CashInventory cashInventory, Value value) {
        List<Note> notes = new ArrayList<>();

        if(amount == 0) {
            return notes;
        }

        Integer numberOfNotes = amount / value.getValue();
        Integer notesInInventory = cashInventory.getNoteCount(value);
        Integer availableNotes = Math.min(numberOfNotes, notesInInventory);

        for(int i=0; i<availableNotes; i++) {
            notes.add(new Note(value));
        }

        return notes;
    }
}
