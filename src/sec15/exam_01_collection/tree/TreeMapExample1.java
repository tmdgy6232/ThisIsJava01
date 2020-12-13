package sec15.exam_01_collection.tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(98), "이동수");
        scores.put(new Integer(75), "박길수");
        scores.put(new Integer(95), "신용권");
        scores.put(new Integer(80), "김자바");

        Map.Entry<Integer, String> enrty = null;

        enrty = scores.firstEntry();
        System.out.println("가장 낮은 점수 : " + enrty.getKey() + "-" + enrty.getValue() );

        enrty = scores.lastEntry();
        System.out.println("가장 높은 점수 : " + enrty.getKey() + "-" + enrty.getValue());

        enrty = scores.lowerEntry(new Integer(95));
        System.out.println("95점 아래점수 : " + enrty.getKey() + "-" + enrty.getValue());

        enrty = scores.higherEntry(new Integer(95));
        System.out.println("95점 위의 점수 : " + enrty.getKey() + "-" + enrty.getValue());

        enrty = scores.floorEntry(new Integer(95));
        System.out.println("95점 이거나 바로 아래 점수 : " + enrty.getKey() + "-" +enrty.getValue());

        enrty = scores.ceilingEntry(new Integer(85));
        System.out.println("85점 이거나 바로 위의 점수 : " + enrty.getKey() + "-" + enrty.getValue());

        while(!scores.isEmpty()){
            enrty = scores.pollFirstEntry();
            System.out.println(enrty.getKey() + "-" + enrty.getValue() + " 남은 객체 수 : " + scores.size());
        }
    }
}
