package sec15.exam_01_collection.list;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member){
            Member member = (Member) obj;
            return member.name.equals(name) && member.age == age;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() { // name과 age가 같으면 동일한 hashcode 리턴
        return name.hashCode()+age;
    }
}
