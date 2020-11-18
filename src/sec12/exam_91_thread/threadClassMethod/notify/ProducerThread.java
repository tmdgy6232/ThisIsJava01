package sec12.exam_91_thread.threadClassMethod.notify;

public class ProducerThread extends Thread {
    public DataBox dataBox;

    public ProducerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i=0; i<=3; i++){
            String data = "Data-" + i;
            dataBox.setData(data);
        }
    }
}
