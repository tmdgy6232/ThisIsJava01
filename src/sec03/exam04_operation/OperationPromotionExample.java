package sec03.exam04_operation;

public class OperationPromotionExample {

    public static void main(String[] args) {

        /**
         * 바이트 타입(int 이하의 바이트사이즈를 갖는 모든 타입)끼리의 연산은 인트형으로 형변환되어 수행되기 때문에
         * 바이트타입으로 받아주면 컴파일 에러가 난다.
         * */

        byte byteValue1 = 20;
        byte byteValue2 = 10;

        //byte byteValue3 = byteValue1 + byteValue2;
        int byteValue3 = byteValue1 + byteValue2;
        System.out.println(byteValue3);

        char charValue1 = 'A';
        char charValue2 = 1;

        //char charValue3 = charValue1 + charValue2;
        int charValue3 = charValue1 + charValue2;
        System.out.println("유니코드 : " + charValue3);
        System.out.println("출력문자 : " +(char) charValue3);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        //int intValut6 = 19/1.0;
        double doubleValue = intValue3 / 4.0;
        System.out.println(doubleValue);
    }
}
