package sec06.exam06_final;

public class Person {
    /**
     * Final
     * 초기값이 저장되면 이것이 프로그램 실행 도중의 최종값이 되어 변경할 수 없음.
     * 초기값 설정에는 필드에 직접 선언해주는 방법과
     * 생성자 호출시에 선언하는 방법 2개가 있음.
     *
     * */

    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }

}
