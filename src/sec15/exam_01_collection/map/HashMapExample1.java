package sec15.exam_01_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        // Map collection created
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("임승효", 100);
        map.put("동장군", 95);
        map.put("홍길동", 10); // 같은 key값으로 넣어주면 대치됨
        System.out.println("All Entry Cavity : " + map.size()); // 저장된 총 entry 수 얻기

        // 객체 찾기
        System.out.println(" 홍길동 : " + map.get("홍길동")); // 이름(키)로 정수(값)을 검색
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println( key + " : " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entryset = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entryset.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();

        // 객체 전체삭제
        map.clear();
        System.out.println(map.size());

    }
}
