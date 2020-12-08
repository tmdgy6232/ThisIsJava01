package sec15.exam_01_collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"DATABASE");
        list.add("ibatis");

        int size = list.size();
        System.out.println("총 개체수 : " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2 : " + skill);

        for (int i=0; i<size; i++){
            String str = list.get(i);
            System.out.println( i +" : " +str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("ibatis");

        for (int i=0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println( i +" : " +str);
        }
    }
}
