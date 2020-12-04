package sec14.exam_01_lamda;

public class Man {
    private String name;
    private String id;

    public Man(){
        System.out.println("Member() 실행");
    }

    public Man(String id) {
        System.out.println("Member(String id) 실행");
        this.id = id;
    }

    public Man(String name, String id) {
        System.out.println("Member(String name, String id) 실행");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
