package sec06.exam04_static;

import sec06.exam01_class.Car;

public class Television {

    static String company = "Apple";
    static String model = "Iphone";
    static String info;

    int fieldl;
    void method(){};
    /**
     *  정적 블록 (static block)
     *  클래스가 메모리에 로드될 때 선언된 순서대로 실행된다. 그러기 때문에 따로 객체 생성을 해주지 않아도 된다.
     *  정적 메소드와 정적 블록을 선언할 때 주의할 점은, 객체가 없어도 실행된다는 특징 때문에
     *  이들 내부에 인스턴스 필드나 인스턴스 메소드는 사용할 수 없다. 또한 객체 자신의 참조인 this도 사용이 불가능하다.
     *
     * */
    // 정적 블록
    static {
        //field1= 10; 컴파일에러
        //method(); 컴파일 에러
        info = company + " - " + model;
    }

    /**
     *  인스턴스 변수나 메소드를 사용하고 싶다면 객체를 먼저 생성하고 참조변수로 접근해야함. main()메소드도
     *  정적 메소드이므로 객체 생성 없이 인스턴스 필드와 인스턴스 메소드를 사용할 수 없음.
     * */

    //정적 메소드
    static void staticMethod(){
        Television television = new Television();
        television.fieldl = 10;
    }
}
