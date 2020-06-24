package sec03.exam01_promotion;

public class PromotionExample {

    public static void main(String[] args) {

        /**
         * 타입 변환
         * 타입 변환은 크게 자동(묵시적) 형변환과 강제(명시적) 형변환으로 나뉜다.
         * 자동 형변환은 메모리 크기가 작은 데이터를 큰 데이터에 연산했을 때 일어난다.
         * 반대의 경우에는 컴파일 에러가 발생한다.
         *
         */

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println(intValue);

        intValue = 500;

        long longValue = intValue;
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);

        longValue = 1000000000000L;
        float floatValue = longValue;
        // float는 4바이트고 long은 8바이트지만 데이터 입력 방식이 부동소수점 방식을 사용하기 때문에 데이터 자체는 더 크게 들어가 가능한 방식이다.
    }
}
