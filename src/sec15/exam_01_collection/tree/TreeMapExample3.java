package sec15.exam_01_collection.tree;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", new Integer(10));
        treeMap.put("forever", new Integer(60));
        treeMap.put("description", new Integer(20));
        treeMap.put("ever", new Integer(40));

        System.out.println("c-f 사이의 단어검색");

        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", false);
        for (Map.Entry<String, Integer> entry : rangeMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
