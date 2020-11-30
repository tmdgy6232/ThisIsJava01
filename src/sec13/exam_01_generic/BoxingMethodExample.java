package sec13.exam_01_generic;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.getObject();

        Box<String> box2 = Util.<String>boxing("홍길동");
        String strValue = box2.getObject();

        System.out.println(strValue + intValue);
    }
}
