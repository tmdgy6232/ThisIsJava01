package sec02.exam_02_char;

public class CharExample {
    public static void main(String[] args) {
        /**
         *  char type
         *  2byte 부호없는 정수값 저장
         *  자바에서 char타입에는 한 문자를 유니코드로 저장하고 있다.
         *  하나의 문자 리터럴은 작은따옴표(')로 감싸야한다.
         * */

        // 유니코드를 알고싶을 경우
        // 해당 글자를 char 변수안에 넣고
        // int 타입에 대입해주면 된다.

        char c = 'A';
        int aUnicode = c;
        System.out.println("A의 유니코드 : " + aUnicode);

        /**
         *  문자와 문자열은 다르다.
         *  문자열은 큰따옴표로 리터럴을 작성, 문자는 작은따옴표로 작성한다.
         *  문자열은 String타입에 저장한다.
         *
         *  빈(empty) 문자 처리
         *  char c = ''; // 컴파일 에러
         *  char c = ' '; // 공백(유니코드:32) 가능
         *  String str = ""; // 가능
         * */

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uAC00';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
