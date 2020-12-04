package sec14.exam_01_lamda;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a, b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("java9", "JAVA9"));

        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("data", "zata"));
    }

    public static void print(int order){
        if (order < 0)  System.out.println("사전 순으로 먼저 옵니다.");
        else if (order == 0) System.out.println(" 동일한 문자열입니다.");
        else System.out.println("사전 역순으로 옵니다.");
    }
}
