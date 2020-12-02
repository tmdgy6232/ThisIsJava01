package sec14.exam_01_lamda;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i=0; i<10; i++){
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("2번째 쓰레드");
        });
        thread1.start();
    }
}
