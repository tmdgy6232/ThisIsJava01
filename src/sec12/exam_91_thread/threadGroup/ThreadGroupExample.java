package sec12.exam_91_thread.threadGroup;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[ main 스레드 그룹의 ㅣist() 메소드 출력 ]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try{
            Thread.sleep(3000);
        }catch (Exception e){}

        System.out.println(" [ myGroup 스레드 그룹의 interrupt() method call ]");
        myGroup.interrupt();
    }
}
