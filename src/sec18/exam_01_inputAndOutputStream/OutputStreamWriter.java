package sec18.exam_01_inputAndOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/test.txt");

        Writer writer = new java.io.OutputStreamWriter(fos);

        String data = "아오 힘들어 뒤지겠네 ㅋㅋㅋ" ;
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일 저장 완료");
    }
}
