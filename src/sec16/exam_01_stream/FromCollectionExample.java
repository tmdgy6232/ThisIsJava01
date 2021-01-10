package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("임승효", 100)
                ,  new Student("박솔", 90)
                , new Student("한수찬", 20));

        Stream<Student> stream = studentList.stream();

        stream.forEach(student -> System.out.println(student.getName()));

    }
}
