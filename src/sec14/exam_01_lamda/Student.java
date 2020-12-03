package sec14.exam_01_lamda;

public class Student {
    private String name;
    private String sex;
    private int socre;

    public Student(String name, String sex, int socre) {
        this.name = name;
        this.sex = sex;
        this.socre = socre;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getSocre() {
        return socre;
    }
}
