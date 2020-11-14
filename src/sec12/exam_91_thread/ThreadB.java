package sec12.exam_91_thread;

public class ThreadB extends Thread {
    public void run(){
        for (int i=0; i<2; i++){
            System.out.println(getName() + "가 출력한 내용"); // 쓰레드B 실행내용
        }
    }
}
