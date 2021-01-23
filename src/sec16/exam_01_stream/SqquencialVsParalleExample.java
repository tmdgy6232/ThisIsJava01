package sec16.exam_01_stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqquencialVsParalleExample {

    //요소처리
    public static void work(int value){
        try{
            Thread.sleep(1);
        }catch (InterruptedException e){

        }
    }

    //순차처리
    public static long testSequecial(List<Integer> values){

        long start = System.nanoTime();
        values.stream().forEach(s -> work((s)));
        long end = System.nanoTime();
        long runtime =  end - start;
        return runtime;
    }

    // 병렬처리
    public static long testParalle(List<Integer> list){
        long start = System.nanoTime();
        list.parallelStream().forEach(s -> work(s));
        long end = System.nanoTime();
        long runtime = end - start;
        return runtime;
    }

    public static void main(String[] args) {
        // 소스 컬랙션
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<10000; i++){
            list.add(i);
        }

        // 순차 스트림 처리 시간 구하기
        System.out.println("순차처리 진입");
        long timeSequencial = testSequecial(list);

        System.out.println("병렬처리 진입");
        // 병렬 스트림 처리 시간 구하기
        long timeParalle = testParalle(list);

        if (timeSequencial < timeParalle){
            System.out.println("성능 테스트 결과 : 병렬 처리가 더 빠름");
        } else {
            System.out.println("성능 테스트 결과 : 순차 처리가 더 빠름");
        }
    }
}
