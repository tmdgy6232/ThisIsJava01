package sec12.exam_91_thread.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[작업 처리 요청]");
        class Task implements Runnable {
            Result result;
            Task(Result result){
                this.result = result;
            }
            @Override
            public void run() {
                int sum = 0;
                for ( int i=0; i<=10; i++){
                    sum += i;
                }
                result.addValue(sum);
            }
        };
        Result result = new Result(); // 같은 작업처리 result 객체를 선언해서 Runnable 작업개체의 매개변수로 넘겨줌
        Runnable runnable1 = new Task(result);
        Runnable runnable2 = new Task(result);
        Future<Result> future1 = executorService.submit(runnable1, result);
        Future<Result> future2 = executorService.submit(runnable2, result);

        try {
            result = future1.get();
            result = future2.get();
            System.out.println("[처리 결과]" + result.getAccnumValue() );
            System.out.println("[작업 완료]");
        } catch (Exception e){
            e.getMessage();
        }
        executorService.shutdown();

    }
}

class Result {
    private int accnumValue;
    synchronized void addValue(int value){
        accnumValue += value;
    }

    public int getAccnumValue() {
        return accnumValue;
    }

    public void setAccnumValue(int accnumValue) {
        this.accnumValue = accnumValue;
    }
}
