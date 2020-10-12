package sec11.exam_01_Api;

public class ObjectClass {
    public static void main(String[] args) {
     /**
      * Object클래스의 equals메소드
      * 이 메소드는 비교연산자인 ==와 동일한 결과를 리턴한다. 두 객체가 동일한 객체라면
      * true, 아니라면 false를 리턴한다.
      * */
      Object object1 = new Object();
      Object object2 = new Object();

      boolean result = object1.equals(object2);

      System.out.println(result);
    }
}
