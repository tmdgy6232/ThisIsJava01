package sec12.exam_91_thread.demon;

public class DemonExample {
    public static void main(String[] args) {
        AutosaveThread autosaveThread = new AutosaveThread();
        autosaveThread.setDaemon(true);
        autosaveThread.start();

        try{
            Thread.sleep(3000);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("메인 스레드 종료");

    }
}
