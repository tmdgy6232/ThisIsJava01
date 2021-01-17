package sec16.exam_01_stream;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        // 2의 배수 갯수
        long count = Arrays.stream(new int[] {1, 2, 3, 4, 5}).filter(n -> n%2 ==0).count();

        System.out.println("2의 배수 갯수 : " + count);

        //2의 배수 합계
        long sum = Arrays.stream(new int[]{1,2,3,4,5}).filter(n -> n%2==0).sum();
        System.out.println("2의 배수 합계 : " + sum);

        // 2의 배수 평균
        double avg = Arrays.stream(new int[]{1,2,3,4,5}).filter(n -> n%2==0).average().getAsDouble();
        System.out.println("2의 배수 평균 : " + avg);

        // 2의 배수 최댓값
        int max = Arrays.stream(new int[]{1,2,3,4,5}).filter(n -> n%2==0).max().getAsInt();
        System.out.println("2의 배수 최댓값 : " + max);

        // 2의 배수 최솟값
        int min = Arrays.stream(new int[]{1,2,3,4,5}).filter(n -> n%2==0).min().getAsInt();
        System.out.println("2의 배수 최솟값 : " + min);

        // 첫 번째 3의 배수
        int first = Arrays.stream(new int[]{1,2,3,4,5}).filter(n -> n%3==0).findFirst().getAsInt();

        System.out.println("첫 번째 3의 배수 : " + first);

    }
}
