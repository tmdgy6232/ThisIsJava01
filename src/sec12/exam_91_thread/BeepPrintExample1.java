package sec12.exam_91_thread;

import sec08.exam_03_AnonymousClass.Person;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }
        }

        for (int i=0; i<5; i++){
            System.out.println("Ting");
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }
        }

    }
}
