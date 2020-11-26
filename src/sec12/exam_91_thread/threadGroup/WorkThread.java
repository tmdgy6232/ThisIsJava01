package sec12.exam_91_thread.threadGroup;

public class WorkThread extends Thread {
    public WorkThread(ThreadGroup threadGroup, String threadName){
        super(threadGroup, threadName); // 스레드 그룹과 스레드 이름을 설정
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(getName() + " interupted");
                break;
            }
        }
        System.out.println(getName() + "종료됨");
    }
}
