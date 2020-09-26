package sec08.exam_01_interface;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 1;
    /**
     * 인터페이스의 상수필드는 대문자로 선언한다.
     * 단어의 조합일 경우 _로 구분한다.
     *
     * */

    /**
     * 추상 메소드
     * */
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //디폴트 메소드 선언
    default void setMute(boolean mute){
        if (mute){
            System.out.println("무음 처리");
        } else {
            System.out.println("무음해");
        }
    }

    // 정적 메소드

    static void changeBattery(){
        System.out.println("건전지교체");
    }
}
