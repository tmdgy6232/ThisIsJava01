package sec12.exam_91_thread;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        BeepTask beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i=0; i<5; i++){
            System.out.println("Thing");
            try{

            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
