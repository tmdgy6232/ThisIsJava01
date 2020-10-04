package sec08.exam_02_overlapClass;

public class AExample {

    public static void main(String[] args) {

        /**
         * 인스턴스 멤버 클래스를 사용하려면 감싸주는 클래스를 먼저 선언해줘야 한다.
         * */
        A a = new A();
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();
    }
}
