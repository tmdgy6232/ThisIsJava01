package sec11.exam_01_Api.Arrays;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args) {
        //기본 타입값 검색
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int inddex = Arrays.binarySearch(scores, 99);
        System.out.println(inddex);
    }
}
