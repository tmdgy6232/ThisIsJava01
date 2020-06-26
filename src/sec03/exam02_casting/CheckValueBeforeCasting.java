package sec03.exam02_casting;

public class CheckValueBeforeCasting {

    public static void main(String[] args) {

        /**
         * 타입 변환을 하기 전에 타입변환이 가능한 지 체크를 해주어야 한다.
         * 해주지 않고 진행했을 시, 값을 벗어나는 데이터를 입력하게 되면 쓰레기 값이 들어가게 된다.
         *
         * */
        int i = 125;

        if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE){
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 입력해 주세요..");
        } else {
            byte b = (byte) i;
            System.out.println(b);
        }




    }
}
