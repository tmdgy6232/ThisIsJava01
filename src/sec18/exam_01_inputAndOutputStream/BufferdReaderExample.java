package sec18.exam_01_inputAndOutputStream;

import java.io.*;
import java.nio.Buffer;

public class BufferdReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);     // 버퍼스트림 생성

        System.out.println("입력 : ");
        String lineString = br.readLine();

        System.out.println("출력 : " + lineString);
    }
}
