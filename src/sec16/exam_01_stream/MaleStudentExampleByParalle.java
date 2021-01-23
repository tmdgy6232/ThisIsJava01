package sec16.exam_01_stream;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExampleByParalle {
    public static void main(String[] args) {
        List<Member> totalList = Arrays.asList(
                new Member("홍길동", Member.MALE,44)
                , new Member("임승효", Member.MALE, 29)
                , new Member("최이솔", Member.FEMALE, 2)
                , new Member("한경용", Member.MALE, 60)
        );

        MaleStudent maleStudent = totalList.parallelStream().filter(s -> s.getSex() == Member.MALE).collect(
                MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine
        );

        maleStudent.getStudentList().stream().forEach(s -> System.out.println(s.getName()));
    }
}
