package AtmDesignProblem;

public class Note {
    private Value value;

    public Note(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
