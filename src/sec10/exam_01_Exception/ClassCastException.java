package sec10.exam_01_Exception;

public class ClassCastException {
    public static void main(String[] args) {
        /**
         * 타입변환(Casting)은 상위 클래스와 하위 클래스 간에 발생하고 구현 클래스와 인터페이스 간에도 발생한다.
         * 이런 관꼐가 아니라면 클래스는 다른 클래스로 타입 변환할 수 없다.
         * 억지로 타입 변환하면 ClassCastException이 발생한다.
         * 이 에러를 발생하지 않으려면
         * instanceof 연산의 결과가 ture 인지 확인하는 것이 좋다.
         * */
        Dog dog = new Dog();
        changDog(dog);

        Cat cat = new Cat();
        changDog(cat);

    }
    public static void changDog(Animal animal){
        Dog dog = (Dog) animal;
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
