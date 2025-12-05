package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    String name;
    int age;
    String rollNumber;

    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract StudentBuilder setSubjects();
    
    public Student build() {
        return new Student(this);
    }
}
