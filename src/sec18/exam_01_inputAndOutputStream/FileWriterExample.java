package sec18.exam_01_inputAndOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(
                "src/test.txt", true
        );

        fw.write("FileWriter는 한글로 된 문자열을 바로 출력할 수 있따.");
        fw.flush();
        fw.close();
        System.out.println("파일이 저장되었습니다.");

    }
}
