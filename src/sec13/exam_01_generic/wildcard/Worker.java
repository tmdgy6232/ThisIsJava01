package sec13.exam_01_generic.wildcard;

public class Worker extends Person {
    String name;

    public Worker(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public Worker(String s) {
        super(s);
    }
}
