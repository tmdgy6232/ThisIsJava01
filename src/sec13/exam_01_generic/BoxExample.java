package sec13.exam_01_generic;

public class BoxExample {
    public static void main(String[] args) {
        // 비제네릭 타입 이용
        Box<String> box = new Box<String>();
        box.setObject("hello"); // String => object 자동타입변환
        String name = box.getObject(); // obejct => String  강제 타입변환

        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(6);
        int value = integerBox.getObject();
    }
}
