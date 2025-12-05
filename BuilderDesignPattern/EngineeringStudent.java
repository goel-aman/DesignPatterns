package BuilderDesignPattern;

public class EngineeringStudent extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = java.util.List.of("Mathematics", "Physics", "Computer Science", "Electronics");
        return this;
    }
}
