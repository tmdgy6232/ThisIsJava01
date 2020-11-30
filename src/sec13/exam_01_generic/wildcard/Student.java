package sec13.exam_01_generic.wildcard;

public class Student extends Person {
    String name;

    public Student(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public Student(String s) {
        super(s);
    }
}
