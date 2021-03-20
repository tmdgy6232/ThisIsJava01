package sec19.exam_01_network;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test/test1/test.txt");

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        String data = "안녕하세요";
        Charset charset = Charset.defaultCharset();
        ByteBuffer writeBuffer = charset.encode(data);

        int byteCount = fileChannel.write(writeBuffer); // 파일에 데이터 쓰기
        System.out.println("test.txt : " + byteCount + " byte written");

        fileChannel.close();
    }
}
