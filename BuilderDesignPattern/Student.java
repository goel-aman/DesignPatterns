package BuilderDesignPattern;
import java.util.List;

public class Student {
    String name;
    int age;
    String rollNumber;

    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.rollNumber = builder.rollNumber;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Subjects: " + String.join(", ", subjects));
    }
}
