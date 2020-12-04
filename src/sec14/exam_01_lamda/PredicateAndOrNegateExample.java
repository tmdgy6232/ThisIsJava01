package sec14.exam_01_lamda;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        // 2의 배수 검사
        IntPredicate predicateA = a -> a%2 == 0;

        // 3의 배수 검사
        IntPredicate predicateB = a -> a%3 == 0;

        IntPredicate predicateAB;
        boolean result;

        //And
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("2와 3의 배수입니까 ? " + result);

        // or
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("2와 3의 배수가 있습니까 ? " + result);

        //negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수입니까 ? " + result);

    }
}
