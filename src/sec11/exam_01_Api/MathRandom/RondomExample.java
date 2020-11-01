package sec11.exam_01_Api.MathRandom;

import java.util.Random;

public class RondomExample {
    public static void main(String[] args) {
        // 선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.println("선택번호 : ");
        for(int i=0; i<6; i++){
            selectNumber[i] = random.nextInt(45) +1;
            System.out.println(selectNumber[i]);
        }
    }
}
