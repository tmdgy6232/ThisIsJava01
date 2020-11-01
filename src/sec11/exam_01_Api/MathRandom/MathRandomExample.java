package sec11.exam_01_Api.MathRandom;

public class MathRandomExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) +1;
        System.out.println("주사ㅟ 눈 : " + num);
    }
}
