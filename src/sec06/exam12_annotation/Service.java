package sec06.exam12_annotation;

public class Service {
    @PrintAnnotation
    public void method(){
      System.out.println("실행내용 1");
    }

    @PrintAnnotation("*")
    public void method2(){
        System.out.println("실행내용 2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3(){
        System.out.println("실행내용 3");
    }
}
