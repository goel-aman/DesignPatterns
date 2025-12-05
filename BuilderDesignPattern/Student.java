package BuilderDesignPattern;
import java.util.List;

public class Student {
    String name;
    int age;
    String rollNumber;

    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(String name, int age, String rollNumber, String fatherName, String motherName, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subjects = subjects; 
    }

    // if the user want to have a lot of the field as optional then builder design pattern is used.

    // if the user want to values for some fields the multiple constructor needs to be created...
    // what ever is written below is not a good practice in general...
    public Student(String rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public Student(String fatherName, int age, String motherName, String rollNumber) {
        this.fatherName = fatherName;
        this.age = age;
        this.motherName = motherName;
        this.rollNumber = rollNumber;
    }
}
