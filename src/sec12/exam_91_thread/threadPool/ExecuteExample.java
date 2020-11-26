package sec12.exam_91_thread.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // 최대 스레드 개수가 2인 스레드를 생성

        for (int i=0; i<10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    //스레드 총 개수 및 작업 스레드 이름 출력
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int pollSize = threadPoolExecutor.getPoolSize();
                    String threradName = Thread.currentThread().getName();

                    System.out.println("총 스레드 갯수 : " + pollSize + " 작업 스레드 이름 : " + threradName);
                    // 예외 발생시킴
                    int value = Integer.parseInt("삼");
                }
            };
            // 작업처리요청
            //executorService.execute(runnable);
            executorService.submit(runnable);
            Thread.sleep(10); // 콘솔에 출력 시간을 주기 위해 0.01초 일시 정지시킴
        }
        executorService.shutdown(); //스레드풀 종료
    }
}
