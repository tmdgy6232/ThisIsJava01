package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30)
                , new Member("임승효", Member.MALE, 29)
                , new Member("김나리", Member.FEMALE, 45)
                , new Member("안수정", Member.FEMALE, 50)
                );

        double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();

        System.out.println("남자평균나이 : " + ageAvg);

    }
}
