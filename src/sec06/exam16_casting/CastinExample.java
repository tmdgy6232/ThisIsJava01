package sec06.exam16_casting;

public class CastinExample {
    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.a = 4;
        parent.b= 1;
        Child child = (Child) parent;
        child.c = 4;

        /*
        *
        * Casting은 상 속 관계에 할수 있다.
        * 자식을 부모로 캐스팅 하는건 가능하지만 반대는 되지 않는다.
        * 자 이제 스프링 하러 가자!
        * */
    }
}
