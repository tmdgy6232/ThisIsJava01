package sec08.exam_03_AnonymousClass;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        //익명 객체 필드 사용
        anony.field.wake();
        //익명객체 로컬변수 사용
        anony.method1();
        //익명객체 매개값 사용
        anony.method2(new Person(){
            void study(){
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });

        RemoteControl field2 = new RemoteControl() {
            @Override
            public void turnon() {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void turnoff() {
                System.out.println("TV를 끕니다..");
            }
        };
        anony.method3(10,5);
    }
}
