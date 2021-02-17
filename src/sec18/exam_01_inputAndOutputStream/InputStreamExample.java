package sec18.exam_01_inputAndOutputStream;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test/5-2.jpg");
        File file = new File("test/5-2.jpg");
        System.out.println(file.length());
        System.out.println(file.getName());
        int readByte;
        while ( (readByte = is.read()) != -1) {
            System.out.println(readByte);
        }
    }
}
