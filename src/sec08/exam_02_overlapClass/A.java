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
    // 정적 멤버 클래스
    static class C{
        C(){} // 생성자
        int field1; // 인스턴스 필드
        static int field2; // 정적 필드
        void method(){}; // 인스턴스 메소드
        static void method1(){}; // 정적 메소
    }

    void method(){
        // local Class
        /**
         * 로컬클래스에는 접근제한자 및 static을 붙일 수 없다.
         * 메소드 내부에서만 사용하기 때문에 접근을 제한할 필요가 없기 때문이다.
         * 로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언이 가능하고
         * 정적 필드와 메소드는 선언할 수 없다.
         * 로컬클래스는 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용해야 한다.
         * 주로 다음과 같이 비동기 처리를 위해 스레드 객체를 만들때 사용한다.
         * */
        class  D{
            D(){} // 생성자
            int field1;
            //static int field2;
            void method(){} // instance method
            //static void method2(){}
        }
    }
    void method1(){
        class DownloadThead extends Thread{}
        DownloadThead thead = new DownloadThead();
        thead.start();
    }
}
