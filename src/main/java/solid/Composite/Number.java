package solid.Composite;

public class Number implements ArithmeticExpression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Value is: " + number);
        return number;
    }
}
