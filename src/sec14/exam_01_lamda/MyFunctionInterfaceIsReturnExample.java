package sec14.exam_01_lamda;

public class MyFunctionInterfaceIsReturnExample {
    public static void main(String[] args) {
        MyFunctionalInterfaceIsReturn fi;

        fi = (x, y) -> {
            return x * y;
        };

        System.out.println(fi.rmethod(10, 20));

        fi = (x , y) -> sum(x + 10, y + 20);
        System.out.println(fi.rmethod(20, 40));
    }
    public static int sum(int x, int y){
     return (x + y);
    }
}
