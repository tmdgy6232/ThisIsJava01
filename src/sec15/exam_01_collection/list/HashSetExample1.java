package sec15.exam_01_collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("object cavity : " + size);

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("obejct Cavity " + set.size());

        Iterator<String> iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            String element = iterator1.next();
            System.out.println(element);
        }
        set.clear();
        if (set.isEmpty()) System.out.println("set 비어있다 ㅋ");
    }
}
