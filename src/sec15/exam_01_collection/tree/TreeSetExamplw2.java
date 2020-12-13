package sec15.exam_01_collection.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExamplw2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> decendingSet = scores.descendingSet();
        for (Integer score : decendingSet){
            System.out.println(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
        for (Integer score : ascendingSet){
            System.out.println(score + " ");
        }
        System.out.println();

    }
}
