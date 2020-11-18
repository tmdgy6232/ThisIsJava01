package sec12.exam_91_thread.threadClassMethod.Stop;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
        printThread1.setStop(true);
    }
}
