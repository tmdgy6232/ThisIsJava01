package sec08.exam_01_interface;

public class RemoteControlExample {
    public static void main(String[] args) {

        // 인터페이스 타입 변수 선언
        RemoteControl rc;

        // 구현객체 대입
        // 참조타입 변수이기 때문에 각 구현객체의 주소값이 들어감
        rc = new Television();
        rc = new Audio();

        /**
         *  익명 구현 객체
         *  인터페이스에서 객체를 구현할 때 소스파일을 모두 작성해야 한다는 단점이 있다.
         *  재생성 해서 사용해야 할 경우에는 좋지만 임시 작업 스레드나 ui프로그래밍에서 이벤트를 처리하기위해
         *  일회성으로 사용해야할 경우가 생긴다.
         *  이러한 경우를 위해 자바에서는 소스파일을 구현하지 않고도 객체를 생성할 수 있는 방법을 제공하는데
         *  이를 익명 구현 객체라 한다.
         *  구현방법은 인터페이스 변수명 = new 인터페이스(){
         *      메소드 선언
         *  }
         *  이다. 필드나 메소드의 추가는 가능하지만 기존 인터페이스의 메소드를 누락하는것은 컴파일 에러가 발생한다.
         *
         *  모든 객체는 클래스로부터 생성되는데, 익명구현객체도 에외는 아니다.
         *  이를 컴파일하면 자동으로 클래스명$1.class 라는 클래스파일이 생성된다.
         * */

        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("실행문");
            }

            @Override
            public void turnOff() {
                System.out.println("실행문");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("실행문");
            }
        };
    }
}
