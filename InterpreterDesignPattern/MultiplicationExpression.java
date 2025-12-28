package InterpreterDesignPattern;

public class MultiplicationExpression implements Expression {
    Expression leftExpression;
    Expression rightExpression;

    public MultiplicationExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }

}
