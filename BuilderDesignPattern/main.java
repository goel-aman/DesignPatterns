package BuilderDesignPattern;

public class main {
    public static void main(String[] args) {
        Student mbaStudent = new Director(new MBAStudent())
                .constructStudent("Alice", 24, "MBA2024001", "Bob", "Carol");

        Student engStudent = new Director(new EngineeringStudent())
                .constructStudent("David", 22, "ENG2024001", "Eve", "Frank");

        mbaStudent.printDetails();
        engStudent.printDetails();
    }
}
