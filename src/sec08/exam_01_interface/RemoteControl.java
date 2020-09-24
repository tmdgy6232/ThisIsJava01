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
    
}
