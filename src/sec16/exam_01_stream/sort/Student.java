package sec16.exam_01_stream.sort;

public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {

        return Integer.compare(score, o.score); // 원쪽 파라미터가 크면 양수, 오른쪽이 크면 음수 리턴
    }
}
