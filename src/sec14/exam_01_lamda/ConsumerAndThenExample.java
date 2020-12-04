package sec14.exam_01_lamda;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (member -> {
           System.out.println(member.getName());
        });

        Consumer<Member> consumerB = (member -> {
           System.out.println(member.getId());
        });

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "ㅁㄴㅇㄻㅇㄴㄹ", null));

    }
}
