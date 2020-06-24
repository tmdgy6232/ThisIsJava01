package sec02.exam_03_int;

public class IntExample {

    public static void main(String[] args) {

        /**
         *  int 타
         *
         * int 타입은 자바의 정수연산을 할때 정수리터럴로 사용하는 타입이다.
         * 아래의 byte나 short을 사용하여 정수연산을 하더라고 결국 int형으로 변환 후 작업하기 때문에
         * 연산 속도에 있어선 차이가 나지 않는다.
         *
         */

        int var1 = 10;
        int var2 = 012;
        int var3 = 0xA;

        //int var4 = 1000000000000;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}
