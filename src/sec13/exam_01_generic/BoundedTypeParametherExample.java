package sec13.exam_01_generic;

public class BoundedTypeParametherExample {
    public static void main(String[] args) {
        //String str = Util.compaer("a", "b"); String 은 NUMBER 하위 타입이 아님

        int result1 = Util.compaer(10, 20); // int => Integer 자동 박싱
        System.out.println(result1);

        int result2 = Util.compaer(4.5 , 3); // double => Double 자동박싱
        System.out.println(result2);

    }
}
