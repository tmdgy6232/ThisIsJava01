package sec06.exam01_class;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car();

        //필드값 읽기
        System.out.println("제작회사 : " + myCar.campany);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("햔제속도 : " + myCar.speed);

        //필드값 변경
        myCar.speed = 60;
        System.out.println("수정된속도 : " + myCar.speed);


    }
}
