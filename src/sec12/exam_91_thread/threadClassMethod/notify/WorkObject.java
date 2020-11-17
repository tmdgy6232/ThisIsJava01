package sec12.exam_91_thread.threadClassMethod.notify;

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e){}
    }

    public synchronized void methodB(){
        System.out.println("ThreadA의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e){}
    }
}
