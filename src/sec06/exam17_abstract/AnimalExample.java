package sec06.exam17_abstract;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cay cay = new Cay();

        dog.sound();
        cay.sound();
        System.out.println("-----------------");

        //변수의 자동 타입변환
        Animal animal = null;
        // 자동 타입변환
        animal = new Dog();
        animal.sound();

        animal = new Cay();
        animal.sound();

        // 메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cay());
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }
}
