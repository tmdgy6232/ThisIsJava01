package sec16.exam_01_stream;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args){
        int[] intArr = { 1, 2, 3, 4, 5};

        System.out.println("peek()를 마지막에 호출한 경우");

        Arrays.stream(intArr).filter(a -> a%2 ==0).peek(n -> System.out.println(n));// peek는 중간처리 메소드이기 때문에 최종처리 단계에 호출하면 작동하지 않음

        System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");

        int total = Arrays.stream(intArr).filter(a -> a%2 ==0).peek(s -> System.out.println(s)).sum();
        System.out.println("총합 : " + total);

        System.out.println("forEach()를 마지막에 호출한 경우");
        Arrays.stream(intArr).filter(a -> a%2==0).forEach(s -> System.out.println(s));


    }
}
