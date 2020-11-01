package sec11.exam_01_Api.MathRandom;

public class MathExample {
    public static void main(String[] args) {
        int v1 = Math.abs(-5); //5
        double v2 = Math.abs(-3.14); // 3.14
        System.out.println(v1);
        System.out.println(v2);

        double v3 = Math.ceil(5.3); //6
        double v4 = Math.ceil(-5.3); // -5
        System.out.println(v3);
        System.out.println(v4);

        double v5 = Math.floor(5.3); // 5
        double v6 = Math.floor(-5.3); // -6
        System.out.println(v5);
        System.out.println(v6);

        int v7 = Math.max(5, 9); // 9
        double v8 = Math.max(5.3 , 2.5); // 5.3
        System.out.println(v7);
        System.out.println(v8);

        int v9 = Math.min(5, 9);
        double v10 = Math.min(5.3, 2.5);
        System.out.println(v9);
        System.out.println(v10);

        double v11 = Math.random();
        System.out.println(v11);

        double v12 = Math.rint(5.3);
        double v13 = Math.rint(5.7);
        System.out.println(v12);
        System.out.println(v13);

    }
}
