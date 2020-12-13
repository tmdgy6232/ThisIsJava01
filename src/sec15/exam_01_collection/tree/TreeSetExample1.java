package sec15.exam_01_collection.tree;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println("가장 높음 점수 : " + score);

        score = scores.lower(new Integer(95)); // 95바로 아래객체를 리턴
        System.out.println("95점 아래 점수 : " + score);

        score = scores.higher(new Integer(95)); // 95 바로 윗 객체를 리턴
        System.out.println("95점 바로 위 점수 : " + score);

        score = scores.floor(new Integer(95)); // 95와 같거나 바로 아래 점수
        System.out.println("95점 이거나 바로 아래 점수 : " + score);

        score = scores.ceiling(new Integer(85)); // 85점이거나 바로 윗 점수
        System.out.println("85점이거나 바로 위 점수 : " + score);

        while(scores.isEmpty()){
            score = scores.pollFirst(); // 제일 낮은 객체를 꺼내오고 컬렉션에서 제거
            System.out.println(" 남은객체 수 : " + scores.size());
        }
    }
}
