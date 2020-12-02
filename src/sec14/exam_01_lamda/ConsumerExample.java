package sec14.exam_01_lamda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    // 매개값이 있고 리턴값은 없는 람다식 인터페이스
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t+ "명");
        consumer.accept("배고파 이");

        BiConsumer<String, String> consumer1 = (t, i) -> System.out.println(t + i);
        consumer1.accept("java", "8");

        DoubleConsumer doubleConsumer = d -> System.out.println(d);
        doubleConsumer.accept(0.01);

        ObjIntConsumer<String> consumer2 = (t, i)-> {
            System.out.println(t + i);
        };
        consumer2.accept("data",8);
    }
}
