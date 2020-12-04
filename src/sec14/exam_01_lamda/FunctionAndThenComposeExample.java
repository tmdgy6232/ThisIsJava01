package sec14.exam_01_lamda;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;
        String city;

        functionA = (m) -> {
            System.out.println("여기탄다");
            return m.getAddress();
        };
        functionB = a -> a.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply( new Member("임승효", "lim", new Address("한국", "서울")));
        System.out.println(city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply( new Member("임승효", "lim", new Address("한국", "보길도")));
        System.out.println(city);
    }
}
