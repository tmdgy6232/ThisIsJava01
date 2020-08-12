package sec06.exam09_constructor_access.pakage1;

public class A {
    //Filed
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    //constructor
    //public 접근제한
    public A(boolean a){};
    //default 접근제한
    A(int a){};
    // private 접근제한
    private A(String a){};

}
