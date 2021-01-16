package sec16.exam_01_stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        // 숫자 요소일 경우
        IntStream intStream = Arrays.stream(new int[] {1, 2, 3, 4, 5});

        intStream.sorted().forEach(n -> System.out.println(n + ", "));  // 숫자를 오름차순으로 정렬

        System.out.println();

        // 객체일 경우
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 30)
                , new Student("신용권", 18)
                , new Student("유미선", 20)
        );

        studentList.stream().sorted().forEach(s -> System.out.println(s.getScore())); // 정수를 기준으로 오름차순으로 student 정렬

        System.out.println();

        studentList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s.getScore()));

    }
}
