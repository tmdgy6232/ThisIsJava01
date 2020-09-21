package sec06.exam17_abstract;

public class Cay extends Animal {
    public Cay(){
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
