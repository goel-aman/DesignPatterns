package AtmDesignProblem;

public enum Value {
    One(1),
    Two(2),
    Five(5),
    Ten(10),
    Twenty(20),
    Fifty(50),
    Hundred(100),
    FiveHundred(500);

    private Integer value;

    Value(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}