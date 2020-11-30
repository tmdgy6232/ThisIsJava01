package sec13.exam_01_generic;

public class Util {
    public static <A> Box<A> boxing(A a){
        Box<A> box = new Box<>();
        box.setObject(a);
        return box;
    }

    public static <K , V> boolean compare(Pair<K , V> p1, Pair<K , V> p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
