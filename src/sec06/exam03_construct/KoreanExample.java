package sec06.exam03_construct;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("임승효", "0102340102");
        Korean k2 = new Korean("김은혜", "01030165925");

        System.out.println(k2.name);
        System.out.println(k2.ssn);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
    }
}
