package sec13.exam_01_generic.wildcard;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int  capacity) {
        this.name = name;
        students = (T[]) (new Object[capacity]); // 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고 (T[]) (new Object[n])의 형태로 생성해야한다.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T[] getStudents() {
        return students;
    }

    public void setStudents(T[] students) {
        this.students = students;
    }

    public void add(T t){
        for(int i=0; i<students.length; i++){
            if (students[i] == null){
                students[i] = t;    // 배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
                break;
            }
        }
    }
}
