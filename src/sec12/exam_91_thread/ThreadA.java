package sec12.exam_91_thread;

public class ThreadA extends Thread {
    public ThreadA() {
        setName("ThreadA"); // 스레드 이름 생성
    }

    public void run(){
        for (int i=0; i<2; i++){
            System.out.println(getName() + "가 출력한 내용"); // 쓰레드A 실행내용
        }
    }
}
