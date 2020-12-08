package sec15.exam_01_collection.list;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("홍길동", "신용권", "김자바");
        for (int i=0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        for (int i=0; i<intList.size(); i++){
            System.out.println(intList.get(i));
        }
    }
}
