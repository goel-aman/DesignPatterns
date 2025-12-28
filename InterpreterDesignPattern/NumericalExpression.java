package InterpreterDesignPattern;

public class NumericalExpression implements Expression {
    String variable;

    public NumericalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariable(variable);
    }

}