package sec14.exam_01_lamda;

public class MyFunctionalInterface2Example {
    public static void main(String[] args) {
        MyFunctionalInterface2 mi;

        mi = (x) -> {
            System.out.println(x + 2);
        };

        mi.method(2);
    }
}
