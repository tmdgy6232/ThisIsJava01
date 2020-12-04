package sec14.exam_01_lamda;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("result 1 : " + operator.applyAsInt(20, 30));

        operator = Calculator::staticMethod;
        System.out.println("result 2 : " + operator.applyAsInt(20, 10));

        // 인스턴스 메소드 참조
        Calculator calculator = new Calculator();

        operator = (x, y) -> calculator.instanceMethod(x, y);
        System.out.println("result3 : " + operator.applyAsInt(10, 10));

        operator = calculator :: instanceMethod;
        System.out.println("result4 : " + operator.applyAsInt(40, 10));
    }
}
