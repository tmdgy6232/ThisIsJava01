package sec03.exam02_casting;

public class CastingExample {

    public static void main(String[] args) {

        /**
         * 큰 바이트의 데이터를 작은 바이트의 데이터로도 형변환 할수 있다.
         * 피연산자 앞에 (타입) 을 적어주면 강제 형변환 된다.
         * 여기서 주의할 것은 작은 바이트의 데이터 범위를 넘어가는 데이터는 데이터 유실이 된다는 것.
         * 이부분만 주의해서 사용하자.
         *
         * */

        int intValue = 44032;
        char a = (char) intValue;
        System.out.println(a);

        long longValue = 500;
        intValue = (int)longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int)doubleValue;
        System.out.println(intValue);
    }
}
