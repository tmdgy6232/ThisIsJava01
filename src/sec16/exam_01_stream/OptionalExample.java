package sec16.exam_01_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
        // 예외 발생 java.util.NoSuchElelmentException
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        */

        // 방법 1
        OptionalDouble optionalDouble = list.stream().mapToInt(Integer::intValue).average();
        if (optionalDouble.isPresent()){
            System.out.println("방법 1 평균 : " + optionalDouble.getAsDouble());
        } else {
            System.out.println("방법 1_평균 : " + 0.0);

        }

        //방법2
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("방법 2 평균 : " + avg);

        // 방법 3
        list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("방법 3 평균 : " + a));
    }
}
