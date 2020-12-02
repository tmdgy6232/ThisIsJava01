package sec14.exam_01_lamda;

import java.util.function.IntSupplier;

public class SupplierExample {
    // 매개값은 없고 리턴값이 있는 람다식 인터페이스
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> { return 100;};
        int a = intSupplier.getAsInt();
        System.out.println(a);
    }
}
