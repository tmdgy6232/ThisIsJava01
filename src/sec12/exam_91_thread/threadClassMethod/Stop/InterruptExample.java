package sec12.exam_91_thread.threadClassMethod.Stop;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread2 printThread2 = new PrintThread2();

        printThread2.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
        printThread2.interrupt();
    }
}
