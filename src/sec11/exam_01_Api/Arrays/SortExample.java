package sec11.exam_01_Api.Arrays;

import java.util.Arrays;

public class SortExample{
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);

        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

    }
}
