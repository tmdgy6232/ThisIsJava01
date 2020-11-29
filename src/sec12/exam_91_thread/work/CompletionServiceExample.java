package sec12.exam_91_thread.work;

import java.util.concurrent.*;

public class CompletionServiceExample extends Thread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[작업 처리 요청]");
        for (int i=0; i<=3; i++){
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i=0; i<10; i++){
                        sum += i;
                    }
                    System.out.println("작업 끝");
                    return sum;
                }
            });
        }

        System.out.println("[처리 완료된 작업 확인]");
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        System.out.println("작업완료통보 작업요청");
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("처리결과 : " + value);
                    } catch (Exception e){
                        e.printStackTrace();
                        break;
                    }
                }
            }
        });
        try {
            Thread.sleep(3000);
        } catch (Exception e){}
        System.out.println("3초뒤에 다시 get호출");
        executorService.shutdownNow();
    }
}
