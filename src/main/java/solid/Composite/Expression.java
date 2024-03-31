package solid.Composite;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int val = 0;
        switch (operation) {
            case Add:
                val = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case Subtract:
                val = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case Multiply:
                val = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case Divide:
                val = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        return val;
    }
}
