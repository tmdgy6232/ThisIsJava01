package sec08.exam_01_interface;

public class RemoteControlExample2 {
    public static void main(String[] args) {

        RemoteControl rc = null;

        rc  = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();

        //디폴트 메소드의 사용
        rc.setMute(true);

        // 정적메소드
        // 인터페이스의 정적메소드는 인터페이스로 바로 호출이 가능하다.
        RemoteControl.changeBattery();
    }
}
