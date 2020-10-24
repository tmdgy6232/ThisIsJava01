package sec11.exam_01_Api.String;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str = "Java Programing";
        String str2 = "JAVA Programing";

        System.out.println(str.equals(str2));

        String lowerstr = str.toLowerCase();
        String lowerstr2 = str2.toLowerCase();

        System.out.println(lowerstr.equals(lowerstr2));

    }
}
