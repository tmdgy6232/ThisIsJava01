package sec03.exam03_accuracy;

public class FromIntToDouble {
    public static void main(String[] args) {

        /**
         *
         * 해당 데이터는 로직상으로는 제대로 나오는 데이터라 생각되겠지만,
         * float 형식은 메모리 사이즈가 int의 4바이트를 충분히 커버할 수 있지만
         * 저장형식이 가수와 지수로 나뉘어 있다. 아래 코드의 인트타입의 값은
         * float 타입에 배정된 가수의 비트수로 표현할 수 있는 값을 넘어섰기 때문에
         * 근사값을 저장하게 되고, 결국 두 변수는 다른값을 저장하고 있다. 따라서 이러한 경우
         * double 타입을 써준다.
         *
         */

        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;

        System.out.println(result);
    }
}
