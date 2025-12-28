package InterpreterDesignPattern;

public class main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setVariable("x", 5);
        context.setVariable("y", 10);

        Expression numExp1 = new NumericalExpression("x");
        Expression numExp2 = new NumericalExpression("y");
        Expression addExp = new MultiplicationExpression(numExp1, numExp2);

        int result = addExp.interpret(context);
        System.out.println("Result of x * y: " + result); // Output: Result of x + y: 15
    }
}
