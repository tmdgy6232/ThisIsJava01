package sec18.exam_01_inputAndOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;

        FileInputStream fis1 = new FileInputStream("test/5-2.jpg");
        start = System.currentTimeMillis();
        while (fis1.read() != -1){

        }
        end = System.currentTimeMillis();

        System.out.println(" 사용하지 않았을 때 : " + (end - start) + "ms");

        FileInputStream fis2 = new FileInputStream("test/5-2.jpg");
        BufferedInputStream fis3 = new BufferedInputStream(fis1);


        start = System.currentTimeMillis();
        while (fis3.read() != -1){}
        end = System.currentTimeMillis();
        System.out.println(" 사용했을 때  : " + (end - start) + "ms");

        fis2.close();
        fis1.close();
    }
}
