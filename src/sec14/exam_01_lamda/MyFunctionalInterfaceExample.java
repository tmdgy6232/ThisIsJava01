package sec14.exam_01_lamda;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface mi;

        mi = () -> System.out.println("가즈아");

        System.out.println("이제 호출한다");
        mi.method();

        mi = () -> {
          String str = "hello";
          System.out.println(str);
        };
        mi.method();
    }
}
