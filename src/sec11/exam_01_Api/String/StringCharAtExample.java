package sec11.exam_01_Api.String;

public class StringCharAtExample {
    public static void main(String[] args) {
        String ssn = "930904-1554675";
        char sex = ssn.charAt(7);
        switch (sex){
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
