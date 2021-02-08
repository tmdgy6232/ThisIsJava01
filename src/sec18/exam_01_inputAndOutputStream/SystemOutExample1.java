package sec18.exam_01_inputAndOutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;

        for (byte b = 47; b<58; b++){
            os.write(b);        // 아스키코드 47에서 57까지의 문자를 출
        }
        os.write(10); // 라인피드 10을 출력하면 다음 행으로 넘어감

        for (byte b=97; b<123; b++){
            os.write(b);
        }

        String hangeul = "가나다라마바사아자차카타파하";
        byte[] bytes = hangeul.getBytes();
        os.write(bytes);

        os.flush();
    }
}
