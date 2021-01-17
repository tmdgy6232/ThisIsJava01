package sec16.exam_01_stream;

import java.util.*;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("홍길동", Member.MALE, 40));
        memberList.add(new Member("김미연", Member.FEMALE, 20));
        memberList.add(new Member("임승효", Member.MALE, 30));
        memberList.add(new Member("서지", Member.FEMALE, 10));

        // 남자만 묶어 List생성
        List<Member> maleList = memberList.stream().filter(m -> m.getSex() == Member.FEMALE).collect(Collectors.toList());

        maleList.stream().forEach(s -> System.out.println(s.getAge()));

        System.out.println();
        // 여학생들만 묶어 HashSet 생성
        Set<Member> femaleSet = memberList.stream().filter(s -> s.getSex() == Member.FEMALE).collect(Collectors.toCollection(HashSet::new));
        Iterator<Member> iterator= femaleSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getAge());
        }

    }
}
