package sec06.exam05_singleton;

public class SingletonExample {
    public static void main(String[] args) {

        //Singleton obj1 = new Singleton(); 컴파일에러

        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if (obj1 == obj2){
            System.out.println("같은객체입니다.");
        } else {
            System.out.println("다른객체입니다.");
        }

    }
}
