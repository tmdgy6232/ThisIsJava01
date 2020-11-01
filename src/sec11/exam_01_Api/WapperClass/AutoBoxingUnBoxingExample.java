package sec11.exam_01_Api.WapperClass;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        // auto Boxing
        Integer obj1 = 100;
        System.out.println("value : " + obj1.intValue());

        //대입 시 자동 unboxing
        int value = obj1;
        System.out.println("value : " + value);

        // 연산 시 자동 unboxing
        int result = obj1 + 100;
        System.out.println("value : " + result);

    }
}
