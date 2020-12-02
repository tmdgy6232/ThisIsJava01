package sec11.exam_01_Api;

import java.util.Objects;

public class Student {
    public int sno;
    public String name;
    public String engScore;
    public String mathScore;

    public Student(int sno){
        this.sno = sno;
    }
    public Student(int sno, String name){
        this.sno = sno; this.name = name;
    }

    public Student(int sno, String name, String engScore, String mathScore) {
        this.sno = sno;
        this.name = name;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }
}
