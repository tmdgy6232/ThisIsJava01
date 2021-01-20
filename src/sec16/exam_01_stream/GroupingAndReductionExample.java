package sec16.exam_01_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
    public static void main(String[] args) {
        List<Member> totalList = Arrays.asList(
           new Member("홍길동", Member.MALE, 40)
           , new Member("Jeny", Member.FEMALE, 29)
           , new Member("Seunghyo", Member.MALE, 29)
           , new Member("Taeyeon", Member.FEMALE, 40)
        );

        // 성별을 쉼표로 구분한 이름을 저장하는 map 얻기
        Map<Integer, String> mapByName = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Member::getSex
                                , Collectors.mapping(Member::getName, Collectors.joining(","))));

        System.out.println("남자이름 : " + mapByName.get(Member.MALE));
        System.out.println("여자이름 : " + mapByName.get(Member.FEMALE));

    }
}
