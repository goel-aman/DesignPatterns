package BuilderDesignPattern;

import java.util.List;

public class MBAStudent extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = List.of("Marketing", "Finance", "Human Resources", "Operations");
        return this;
    }
}
