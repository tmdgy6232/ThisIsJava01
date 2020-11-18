package sec12.exam_91_thread.threadClassMethod.Stop;

public class PrintThread2 extends Thread {
    public void run(){
        try {
            while(true){
                System.out.println("실행중");
                Thread.sleep(1);
            }
        } catch (Exception e){}
        System.out.println("자원정리" );
        System.out.println("실행 종료");
    }
}
