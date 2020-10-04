package sec08.exam_02_overlapClass;

public class A {
    // 인스턴스 멤버 클래스
    class B{
        B(){}   // 생성자
        int field1; // 인스턴스 필드
        //static int field2; 정적필드 사용 불가능
        void method1(){}; // 인스턴스 메소드
        //stati void method2(){}; 정적메소드 사용 불가능
    }
}
