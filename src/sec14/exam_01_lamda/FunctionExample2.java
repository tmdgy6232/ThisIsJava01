package sec14.exam_01_lamda;

import sec08.exam_03_AnonymousClass.Person;
import sec11.exam_01_Api.Student;

import java.sql.Struct;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
            new Student(1, "seunghyo", "100", "100"),
            new Student(2, "hyeongjin", "90", "90")
            );

    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double doubleValue = (double) sum / list.size();
        return doubleValue;
    };

    public static void main(String[] args) {
        double englishAvg = avg( s -> Integer.parseInt(s.engScore));
        System.out.println("영어 평균점수 : " + englishAvg);
    }

}
