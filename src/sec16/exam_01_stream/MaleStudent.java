package sec16.exam_01_stream;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
    private List<Member> studentList ;

    public MaleStudent() {
        studentList = new ArrayList<>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");

    }

    public void accumulate(Member member){ // 요소를 수집하는 메소드
        studentList.add(member);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(MaleStudent other){ // 두 MaleStudent를 결합하는 메소드( 병렬처리시에만 호출)
        studentList.addAll(other.getStudentList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Member> getStudentList() {
        return studentList;
    }
}
