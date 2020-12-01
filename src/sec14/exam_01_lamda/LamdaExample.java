package sec14.exam_01_lamda;

public class LamdaExample {
    public static void main(String[] args) {

        Runnable runnable = () -> {
          System.out.println("시작");
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
