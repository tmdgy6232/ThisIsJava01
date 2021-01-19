package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Member> totalList = Arrays.asList(
                new Member("홍길동", Member.MALE,44)
                , new Member("임승효", Member.MALE, 29)
                , new Member("최이솔", Member.FEMALE, 29)
                , new Member("한경용", Member.MALE, 60)
        );

        Map<Integer, List<Member>> mapByAge = totalList.stream().collect(Collectors.groupingBy(Member::getAge));

        System.out.println("29세");
        mapByAge.get(29).forEach(s -> System.out.println(s.getName()));

        Map<Integer, List<String>> mapToSex = totalList.stream()
                .collect(Collectors.groupingBy(Member::getSex, Collectors.mapping(Member::getName, Collectors.toList())));

        mapToSex.get(Member.MALE).forEach(s -> System.out.println(s));
    }
}
