package sec06.exam05_singleton;

public class Singleton {

    /**
     * 싱글톤 패턴
     * 가끔 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있음.
     * 이를 싱글톤이라고 함
     * 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 사용할 수 없게 막아야함.
     * 생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private 접근 제한자를 붙여주면 된다.
     *
     * */
    //정적필드로 객체 생성
    private static Singleton singleton = new Singleton();

    //생성자 접근제한자
    private Singleton(){};

    static Singleton getSingleton(){
        return singleton;
    }

}
