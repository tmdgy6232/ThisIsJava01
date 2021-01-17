package sec16.exam_01_stream;

import java.util.ArrayList;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("신용권", 95));
        studentList.add(new Student("감자바", 88));

        int sum1 = studentList.stream().mapToInt(a -> a.getScore()).sum();
        sum1 = studentList.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum1);

        int sum2 = studentList.stream().map(Student::getScore).reduce((a,b) -> a+b).get();
        System.out.println(sum2);

        int sum3 = studentList.stream().map(Student::getScore).reduce(0, (a,b) -> a+b);
        System.out.println(sum3);

    }
}
