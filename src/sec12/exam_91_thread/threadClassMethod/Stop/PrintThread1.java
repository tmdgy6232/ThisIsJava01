package sec12.exam_91_thread.threadClassMethod.Stop;

public class PrintThread1 extends Thread{
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    public void run(){
        while (!stop){
            System.out.println("실행중");
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}
