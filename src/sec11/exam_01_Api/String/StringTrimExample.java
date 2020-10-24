package sec11.exam_01_Api.String;

public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = " 02";
        String tel2 = " 4564 ";
        String tel3 = " 1111     ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim();

        System.out.println(tel);
    }
}
