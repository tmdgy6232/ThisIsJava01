package sec06.exam17_abstract;

public class PhoneExample {
    // 추상클래스는 인스턴스를 생성할 수 없음.
    //Phone phone = new Phone();
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
