package sec12.exam_91_thread;

public class PriorityExample {
    public static void main(String[] args) {
        for (int i=0; i<1000; i++){
            Thread thread = new CalcThread("thread"+i);
            if (i != 1000){
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
