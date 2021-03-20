package sec19.exam_01_network;

import java.io.IOException;
import java.nio.file.*;

public class FilesCopyMethodExample {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("test/test1/test.txt");
        Path to = Paths.get("test/test1/test2.txt");

        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("파일 복사 성공");
    }
}
