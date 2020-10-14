package sec11.exam_01_Api;

public class Member implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult){
        this.id = id;
        this.password  = password;
        this.name = name;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember(){
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cloned;
    }
}
