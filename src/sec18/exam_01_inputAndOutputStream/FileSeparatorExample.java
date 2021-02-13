package sec18.exam_01_inputAndOutputStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSeparatorExample {
    public static void main(String[] args) throws IOException {
        String fileSeparator = File.separator;      // 해당 os에서 사용하는 파일구분자를 표현해준다.
        System.out.println(fileSeparator);
        File file = new File("./../test.txt");
        System.out.println(FileSeparatorExample.class.getName());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getName());
        System.out.println(file.delete());
        if (file.exists()){
            System.out.println("파일 생성 되었다");
        } else {
            System.out.println("파일 생성이 되지 않았다.");
        }
        // 부모 파일
        File parantsFile = file.getParentFile();
        System.out.println(parantsFile.getName());
        // 전체 경로 리턴
        System.out.println(parantsFile.getPath());
        // directory  여부
        System.out.println(parantsFile.isDirectory());
        // isFile 파일인지 여부
        System.out.println(parantsFile.isFile());
        // isHidden 숨김파일인지 여부
        System.out.println(file.isHidden());
        // lastModified 마지막 수정 날짜 및 시간을 리턴
        System.out.println(file.lastModified());

        Path p = Paths.get(System.getProperty("user.home"));

        System.out.println(p.getFileName());


    }
}
