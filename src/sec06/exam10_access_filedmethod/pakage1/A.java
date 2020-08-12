package sec06.exam10_access_filedmethod.pakage1;

public class A {
    //Field
    public int field1;
    int field2;
    private int field3;

    //method
    public void method1(){};
    void method2() {};
    private void method3(){};

    A(){
        // 같은 클래스 내에선 모두 접근 가능
        field1=1;
        field2=1;
        field3=3;
        method1();
        method2();
        method3();
    }
}
