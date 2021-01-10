package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("임승효", 100)
                ,  new Student("박솔", 90)
                , new Student("한수찬", 20));

        double avg = studentList.stream()
                .mapToInt(Student::getScore) //중간처리(학생 객체를 점수로 매핑)
                .average() // 최종처리( 평균점수 )
                .getAsDouble();
        System.out.println(avg);


    }
}
