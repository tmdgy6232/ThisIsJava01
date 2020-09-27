package sec08.exam_01_interface;

public class MyClass {
    /***
     *
     * 인터페이스의 사용
     * 개발코드에서 인터페이스는 클래스의 필드, 생성자 또는 메소드의 매개변수,
     * 생성자 또는 메소드의 로컬변수로 선언될 수 있다.
     */
    // 필드
    RemoteControl rc = new Television();

    // 생성자
    MyClass(RemoteControl rc){
        this.rc = rc;
    }

    // 메소드
    void methodA(){
        // 로컬변수
        RemoteControl rc = new Audio();
    }

    // 메소드 매개변수
    void methodB(RemoteControl rc){

    }


}
