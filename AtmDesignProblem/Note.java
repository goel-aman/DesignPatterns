package AtmDesignProblem;

public class Note {
    private Integer noteId;
    private Value value;

    public Note(int noteId, Value value) {
        this.noteId = noteId;
        this.value = value;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
