package sec16.exam_01_stream;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "임승효", "김자바", "신민철", "신용권", "임승효");

        names.stream()
        .distinct()         //중복제거
        .forEach(n -> System.out.println(n));

        System.out.println();

        names.stream()
                .filter(m -> m.startsWith("신")) // 필터링
                .forEach(n -> System.out.println(n));

        System.out.println();

        names.stream()
                .distinct()
                .filter(n -> n.startsWith("임") )
                .forEach(n -> System.out.println(n));

    }
}
