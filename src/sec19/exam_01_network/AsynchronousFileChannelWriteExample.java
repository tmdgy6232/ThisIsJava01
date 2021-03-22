package sec19.exam_01_network;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelWriteExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 쓰레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i=0; i<10; i++){
            Path path = Paths.get("test/test1/zzz" + i + ".txt");
            Files.createDirectories(path.getParent());

            // 비동기 파일 채널 생성
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE), executorService);

            //파일에 저장할 데이터를 buffer에 저장
            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = charset.encode("안녕하세요~");
            // 첨부 객체 생성

            class AttachMent {
                Path path; // 파일 경로 저장
                AsynchronousFileChannel fileChannel; //비동기 파일채널 저장
            }

            AttachMent attachMent = new AttachMent();
            attachMent.path = path;
            attachMent.fileChannel = fileChannel;

            //CompletionHandler 객체 생성
            CompletionHandler<Integer, AttachMent> completionHandler = new CompletionHandler<Integer, AttachMent>() {
                @Override
                public void completed(Integer result, AttachMent attachment) {
                    System.out.println(attachMent.path.getFileName() + " : " + result + "byteWriten : " + Thread.currentThread().getName());
                    try {
                        attachMent.fileChannel.close();
                    } catch (Exception e) {}
                }

                @Override
                public void failed(Throwable exc, AttachMent attachment) {
                    exc.printStackTrace();
                    try {
                        attachMent.fileChannel.close();
                    } catch (Exception e){};
                }
            };
            // 버퍼객체, 버퍼인덱스, 첨부객체, 콜백메소드를 가진 객체
            fileChannel.write(byteBuffer, 0, attachMent, completionHandler);
        }
        //Threadpoll close
        Thread.sleep(1000);
        executorService.shutdown();
    }
}
