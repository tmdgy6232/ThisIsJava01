package sec19.exam_01_network;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoriesExample {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("test/test1");
        Path path2 = Paths.get("test/test1/test.txt");

        if (Files.notExists(path1)){
            Files.createDirectories(path1); // 경로상에 존재하지 않는 모든 디렉토리 생성
        }

        if (Files.notExists(path2)){
            Files.createFile(path2);    // 파일 생성
        }

        Path path3 = Paths.get("/Users/imseunghyo/Desktop/ThisisJava01/test");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
        for (Path path : directoryStream){
            System.out.println("이름 : " + path.getFileName());
        }
    }
}
