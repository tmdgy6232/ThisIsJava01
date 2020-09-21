package sec06.exam17_abstract;

public class Dog extends Animal {
    public Dog(){
        this.kind = "포유류";
    }

    // 추상메서드 재정의
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
