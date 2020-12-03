package sec14.exam_01_lamda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = { 92, 95, 87 };

    public static int maxOrWin(IntBinaryOperator operator ){
        int result = scores[0];

        for (int score : scores){
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기
        int max = maxOrWin((a, b) -> {
            if (a >= b) return a;
            else return b;
        });

        System.out.println(max);

        // 최소값 얻기
        int min = maxOrWin((a, b) -> {
            if (a >= b) return b;
            else return a;
        });
        System.out.println(min);
    }

}
