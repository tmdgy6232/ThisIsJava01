package sec12.exam_91_thread;

import sec11.exam_01_Api.String.StringReplaceExample;

public class TargetThread extends Thread {
    public void run(){
        for(long i=0; i<1000000000; i++){}
        try {
            Thread.sleep(1500);
        } catch (Exception e){}
        for(long i=0; i<1000000000; i++){}


    }
}
