package sec10.exam_01_Exception;

public class NullPointExceptionExample {
    public static void main(String[] args) {
        /**
         * NullpointException
         * 자바 프로그램에서 가장 빈번하게 발생하는 실행 예외
         * 이것은 객체 참조가 없는 상태, 즉 null값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를
         * 사용했을 때 발생한다. 객체가 없는 상태에서 객체를 사용하려 하니 에러가 발생하는 것이다.
         * */
        String str = null;
        System.out.println(str.toString());
    }
}
