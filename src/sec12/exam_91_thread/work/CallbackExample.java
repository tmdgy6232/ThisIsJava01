package sec12.exam_91_thread.work;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
    private ExecutorService executorService;

    public CallbackExample(){
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {// 결과타입, 첨부타입
        @Override
        public void completed(Integer result, Void attachment) {// 결과타입, 첨부타입
            System.out.println("complete() 실행 : " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {// 예외타, 첨부타입
            System.out.println("failed() 실행 : " + exc.toString());
        }
    };

    public void doWork(final String x, final String y){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null); // 정상처리 됐을 때 호출
                } catch (Exception e){
                    callback.failed(e, null);   // 예외가 발생했을 경우 호
                }
            }
        };
        executorService.submit(task);   // 스레드 풀에게 작업요청
    }

    public void finish(){
        System.out.println("끝");
        executorService.shutdown(); // 스레드풀 종료
        System.out.println("끝1");
    }

    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();
        example.doWork("3", "3");
        example.doWork("3", "삼");
        example.finish();
    }
}
