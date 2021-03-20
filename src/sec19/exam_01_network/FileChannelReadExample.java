package sec19.exam_01_network;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelReadExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test/test1/test.txt");

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);

        Charset charset = Charset.defaultCharset();
        String data = "";
        int byteCount;

        while(true){
            byteCount = fileChannel.read(byteBuffer);   // 파일로부터 데이터 읽기
            if (byteCount == -1)break;
            byteBuffer.flip();
            data = charset.decode(byteBuffer).toString();
            byteBuffer.clear();
            System.out.println("한번만 타야 정상");
        }
        fileChannel.close();
        System.out.println("file.txt : " + data);
    }
}
