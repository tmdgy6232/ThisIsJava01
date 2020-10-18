package sec11.exam_01_Api.System;

public class SystemTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime(); // 현재시간 읽기

        int sum = 0;
        for (int i= 0; i<100000; i++){
            sum += i;
        }

        long time2 = System.nanoTime();

        System.out.println("1~100000까지의 합 : " + sum);
        System.out.println("계산에 총 " + (time2 - time1) + "나노초가 소요되었습니다.");
    }
}
