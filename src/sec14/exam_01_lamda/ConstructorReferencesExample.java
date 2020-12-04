package sec14.exam_01_lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Man> function1 = Man :: new; // 생성자 참조
        Man man1 = function1.apply("레일리"); // 매개값 1개

        BiFunction<String, String, Man> function2 = Man :: new;
        Man man2 = function2.apply("샹크스", "미호크");



    }
}
