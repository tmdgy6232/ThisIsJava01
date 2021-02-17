package sec18.exam_01_inputAndOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String originalFileName = "./test/5-2.jpg";
        String targetFileName = "./test/5-3.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;

        byte[] readBytes = new byte[1024];
        while ((readByteNo = fis.read(readBytes)) == -1){
            fos.write(readBytes, 0, readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사가 완료되었습니다.");
    }
}
