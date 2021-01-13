package sec16.exam_01_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/test.txt");
        Stream<String> stream;

        // File Line() method call
        stream = Files.lines(path, Charset.defaultCharset()); // 운영체제의 기본 문자셋
        stream.forEach(System.out :: println);
        System.out.println(); // 메소드참조 s-> System.out.println(s)와 동일

        // BufferedReader의 lines 메소드 활용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out :: println);

    }
}
