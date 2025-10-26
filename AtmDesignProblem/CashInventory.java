package AtmDesignProblem;
import java.util.Map;
import java.util.HashMap;

public class CashInventory {
    Map<Note, Integer> cashInventoryMap;

    public CashInventory(Map<Note, Integer> cashInventoryMap) {
        this.cashInventoryMap = cashInventoryMap;
    }

    public Integer getNoteCount(Note note) {
        return cashInventoryMap.get(note);
    }

    public void incrementNoteCount(Note note, Integer count) {
        cashInventoryMap.put(note, cashInventoryMap.get(note) + count);
    }

    public void decrementNoteCount(Note note, Integer count) {
        cashInventoryMap.put(note, cashInventoryMap.get(note) - count);
    }

    public void setNoteCount(Note note, Integer count) {
        cashInventoryMap.put(note, count);
    }
}
