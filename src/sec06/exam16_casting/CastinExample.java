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
        * Casting은 상속 관계에 할수 있다.
        * */
    }
}
