package sec19.exam_01_network;

import sec12.exam_91_thread.threadClassMethod.SumThread;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelReadExample {
    public static void main(String[] args) throws IOException {
        // 쓰레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i=0; i<10; i++){
            Path path = Paths.get("test/test1/zzz" +i+".txt");

            // 비동기 파일 채널 생성
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, EnumSet.of(StandardOpenOption.READ), executorService);

            // 파일의 크기와 동일한 capacity를 갖는 버퍼 생성
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int) fileChannel.size());

            // 첨부 객체 생성
            class Attachment{
                Path path;
                AsynchronousFileChannel fileChannel;
                ByteBuffer byteBuffer;
            }
            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;
            attachment.byteBuffer = byteBuffer;

            //Completionhandler 객체 생성
            CompletionHandler<Integer, Attachment> completionHandler = new CompletionHandler<Integer, Attachment>() {
                @Override
                public void completed(Integer result, Attachment attachment) {
                    attachment.byteBuffer.flip();
                    // 버퍼에 저장된 데이터를 문자열로 복원
                    Charset charset = Charset.defaultCharset();
                    String data = charset.decode(attachment.byteBuffer).toString();
                    System.out.println(attachment.path.getFileName() + " : " + data + " : " + Thread.currentThread().getName());
                    try {
                        fileChannel.close();
                    } catch (Exception e){}
                }

                @Override
                public void failed(Throwable exc, Attachment attachment) {
                    exc.printStackTrace();
                    try {
                        fileChannel.close();
                    } catch (Exception e){}
                }
            };

            // 파일 읽기
            fileChannel.read(byteBuffer, 0, attachment, completionHandler);
        }
        // 쓰레드풀 종료
        executorService.shutdown();
    }
}
