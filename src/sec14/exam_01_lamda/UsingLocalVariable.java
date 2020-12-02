package sec14.exam_01_lamda;

public class UsingLocalVariable {
    void method(int a){ // arg눈 final 특성을 가짐
        int localVar = 40;      // localVar는 final 특성을 가짐

        //a  = 33;
        // localVar = 44;

        // 람다식
        MyFunctionalInterface fi = () -> {
          // 로컬변수읽기
          System.out.println("arg = " + a);
          System.out.println("lovalVar = " + localVar);
        };
        fi.method();
    }
}
