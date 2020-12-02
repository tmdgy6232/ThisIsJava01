package sec14.exam_01_lamda;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method(){
            // 람다식
            MyFunctionalInterface fi = () -> {
                System.out.println(this.innerField);
                System.out.println("outterfield = " + UsingThis.this.outterField);
            };
            fi.method();
        }

    }

}
