package sec18.exam_01_inputAndOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(
                    "./src/sec18/exam_01_inputAndOutputStream/FileInputStreamExample.java"
            );
            int data;

            while ( (data = fis.read() ) != -1){
                System.out.write(data);     //  1바이트씩 읽고 콘솔에 출력
            }
            fis.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
