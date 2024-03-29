package solid.Composite;

public class TestClass {
    public static void main(String[] args) {
        Number num1 = new Number(5);
        Number num2 = new Number(4);
        Number num3 = new Number(3);
        Number num4 = new Number(1);
        Expression expression1 = new Expression(num1, num2, Operation.Multiply);
        Expression expression2 = new Expression(num3, num4, Operation.Subtract);
        Expression expression3 = new Expression(expression1, expression2, Operation.Divide);
        System.out.println(expression1.evaluate());
        System.out.println(expression2.evaluate());
        System.out.println(expression3.evaluate());
    }
}
