package sec12.exam_91_thread.demon;

public class AutosaveThread extends Thread {
    public void save(){
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
                break;
            }
            save();
        }
    }
}
