package sec14.exam_01_lamda;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;

        Fruit fruit;

        binaryOperator = BinaryOperator.minBy( (f1, f2) -> {
           return Integer.compare(f1.price, f2.price);
        });

        fruit = binaryOperator.apply(new Fruit("수박", 1000), new Fruit("참외", 500));
        System.out.println(fruit.name);

        binaryOperator = BinaryOperator.maxBy( (f1, f2) -> {
            return Integer.compare(f1.price, f2.price);
        });

        fruit = binaryOperator.apply(new Fruit("수박", 1000), new Fruit("참외", 500));
        System.out.println(fruit.name);

    }
}
