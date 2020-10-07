package sec08.exam_03_AnonymousClass;

import sec06.exam13_override.pakege2.C;

public class Anonymous {
    //필드 초기값 대입
    Person field = new Person(){
        void work(){
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에일어납니다.");
            work();
        }
    };

    void method1(){
        //로컬 변수값으로 대입
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        //로컬변수 사용
        localVar.wake();
    }

    void method2(Person person){
        person.wake();
    }

    void method3(final int arg1, int arg2){
        final int var1 = 1;
        int var2 = 2;

        int data = 10;

        Calculatable calculatable = new Calculatable() {
            @Override
            public int sum() {
                int result = data + arg1 +arg2+var1+var2;
                return result;
            }
        };

        System.out.println(calculatable.sum());
    }

}
