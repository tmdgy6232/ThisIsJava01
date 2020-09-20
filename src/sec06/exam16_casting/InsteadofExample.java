package sec06.exam16_casting;

public class InsteadofExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
       // 부모타입을 참조하는 객체로는 강제 형변환 할수 없음.
       // Child child = (Child) parent;

        /**
         * 어떤 객체가 어떤 클래스의 인스턴스인지 화긴하려면 instanceof 연산자를 사용할 수 있다.
         * instanceof 연산자와 좌항은 객체가 오고 우항은 타입이 오는데 좌항의 객체가 우항의 인스턴스이면
         * 즉 우항의 타입으로 객체가 생성되었다면 true, 아니면 falsef를 산출한다
         * */

        boolean result = parent instanceof Child;
        System.out.println(result);
    }
}
