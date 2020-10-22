package sec11.exam_01_Api.String;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StringEqualsExample {
    public static void main(String[] args) {

        String str1 = new String("임승효");
        String str2 = "임승효";

        if (str1 == str2){
            System.out.println("같은 객체를 참조");
        } else {
            System.out.println("다른 객체를 참조");
        }

        if (str1.equals(str2)){
            System.out.println("같은 문자열을 가짐");
        } else {
            System.out.println("다른 문자열을 가짐");
        }
    }
}
