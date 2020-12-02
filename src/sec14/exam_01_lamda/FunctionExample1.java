package sec14.exam_01_lamda;

import sec11.exam_01_Api.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

    private static List<Student> list = Arrays.asList(
            new Student(1, "홍길동", "90", "85"),

            new Student(2, "임승효", "80", "100")
    );

    public static void printString(Function<Student, String> function) {
        for (Student student : list){
            System.out.println(function.apply(student)); // 람다식 실행
        }
        System.out.println();
    }

    public static void printint ( ToIntFunction<Student> function ){
        for (Student student : list ){
            System.out.println(function.applyAsInt(student));
        }
        System.out.println();
    }

    // 매개값을 리턴값으로 매핑해주는 함수형 인터페이스
    public static void main(String[] args) {
        printString(t -> t.name);
        printint(t -> Integer.valueOf(t.engScore));
        printint( t-> Integer.valueOf(t.mathScore));
    }
}
