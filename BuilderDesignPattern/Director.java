package BuilderDesignPattern;

public class Director {
    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student constructStudent(String name, int age, String rollNumber, String fatherName, String motherName) {
        return studentBuilder
                .setName(name)
                .setAge(age)
                .setRollNumber(rollNumber)
                .setFatherName(fatherName)
                .setMotherName(motherName)
                .setSubjects()
                .build();
    }
}
