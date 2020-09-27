package sec08.exam_01_interface;

public class RemoteControlExample {
    public static void main(String[] args) {

        // 인터페이스 타입 변수 선언
        RemoteControl rc;

        // 구현객체 대입
        // 참조타입 변수이기 때문에 각 구현객체의 주소값이 들어감
        rc = new Television();
        rc = new Audio();
    }
}
