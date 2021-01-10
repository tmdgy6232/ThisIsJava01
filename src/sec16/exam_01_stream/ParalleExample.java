package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "임승효", "none");

        //순차처리
        Stream<String> stream = list.stream();
        stream.forEach(ParalleExample :: print); // 메소드 참조 (s-> ParallelExaple :: print) 와 같음

        System.out.println();

        //병렬처리
        Stream<String> paralleStream = list.parallelStream();
        paralleStream.forEach(ParalleExample::print);
    }

    public static void print (String s){
        System.out.println(s + " : " + Thread.currentThread().getName());
    }
}
