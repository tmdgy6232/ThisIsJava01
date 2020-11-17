package sec12.exam_91_thread.threadClassMethod.notify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject shareObject = new WorkObject(); // 공유 객체 생성

        ThreadA threadA = new ThreadA(shareObject);
        ThreadB threadB = new ThreadB(shareObject);

        threadA.start();
        threadB.start();
    }
}
