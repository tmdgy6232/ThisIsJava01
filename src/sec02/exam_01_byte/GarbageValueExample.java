package sec02.exam_01_byte;

public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;

        // 자바 기본 정수형, 실수형은 int와 double이기 때문에 뒤에 숫자1을 더하면 에러를 뱉는다.
        //var1 = var1 +1;

        // 그래서 증가연산자를 쓴다.

        var1++;
        System.out.println(var1);

        var1++;
        System.out.println(var1);

        var1++;
        System.out.println(var1);

        // 값을 초과하면 -127을 뱉는다.
        var1++;

        byte var2 = 125;
        int var3 = 125;

        for(int i=0; i<5; i++){
            var2++;
            var3++;
            System.out.println("var2 : " + var2 + "\t" + "var3 : " + var3);
        }

    }
}
