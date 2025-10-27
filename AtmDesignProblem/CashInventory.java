package AtmDesignProblem;
import java.util.Map;
import java.util.HashMap;

public class CashInventory {
    Map<Value, Integer> cashInventoryMap;

    public CashInventory(Map<Value, Integer> cashInventoryMap) {
        this.cashInventoryMap = cashInventoryMap;
    }

    public Integer getNoteCount(Value value) {
        return cashInventoryMap.get(value);
    }

    public void incrementNoteCount(Value value, Integer count) {
        cashInventoryMap.put(value, cashInventoryMap.get(value) + count);
    }

    public void decrementNoteCount(Value value, Integer count) {
        cashInventoryMap.put(value, cashInventoryMap.get(note) - count);
    }

    public void setNoteCount(Value value, Integer count) {
        cashInventoryMap.put(value, count);
    }
}
