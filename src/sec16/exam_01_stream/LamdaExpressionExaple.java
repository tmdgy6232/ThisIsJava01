package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionExaple {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("임승효", 70));

        Stream<Student> studentStream = list.stream(); // 스트림 얻기

        studentStream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });

    }
}
