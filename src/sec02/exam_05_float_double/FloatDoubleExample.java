package sec02.exam_05_float_double;

public class FloatDoubleExample {

    public static void main(String[] args) {

        /**1
         * 실수형 float, double
         *
         *  앞서 정수형 Int와 마찬가지로 자바에서 실수형 리터럴의 기본타입은 double형이다.
         *  그래서 floadt변수로 선언을 하려면 숫자 뒤에 f문자를 덧붙혀야 한다.
         *
         * */

        // 실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14; 컴파일 에러
        float var2 = 3.14f;

        // 정밀도검사
        double var4 = 0.123456789012345678901234567890;
        float var5 = 0.1234567894123456789123456789f;

        System.out.println(var4);
        System.out.println(var5);

        // e사용하기
        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6f;
        double var9 = 2e-3;
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);


    }
}
