package sec12.exam_91_thread;

public class CalcThread extends Thread {
    public CalcThread(String name) {
        setName(name);
    }

    public void run(){
        for(int i=0; i<200000000; i++){

        }
        System.out.println(getName());
    }
}
