package sec12.exam_91_thread;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for (int i=0; i<5; i++){
            System.out.println("Thing");
            try{
                Thread.sleep(600);
            } catch (Exception e){

            }
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++){
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch ( Exception e){}
                }
            }
        });

        thread1.start();
    }
}
