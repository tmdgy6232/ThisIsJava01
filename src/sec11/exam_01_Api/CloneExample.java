package sec11.exam_01_Api;

public class CloneExample {
    public static void main(String[] args) {

        /**
         * 얕은 복제의 경우 참조타입의 주소값도 그대로 복제한다.
         * 그렇기 때문에 깊은복제(참조타입 데이터까지 복제)를 하기 위해서는
         * Object의 clone 메소드를 재정의하여 참조타입 또한 복제하는 코드를 작성해야한다.
         * */
        //원본객체생성
        Member original = new Member("blue", "홍길동", "1234", 25, true);

        // 복제 객체를 얻은 후에 패스워드 변경
        Member clone = original.getMember();

        clone.password = "2345";

        System.out.println(original.hashCode());
        System.out.println(clone.hashCode());
    }
}
