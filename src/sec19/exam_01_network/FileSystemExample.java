package sec19.exam_01_network;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();

        for (FileStore fileStore : fileSystem.getFileStores()){
            System.out.println("드라이버 명 : " + fileStore.name());
            System.out.println("파일시스템 : " + fileStore.type());
            System.out.println("전체공간 : " + fileStore.getTotalSpace() + "byte");
            System.out.println("사용중인 공간  : " + (fileStore.getTotalSpace() - fileStore.getUnallocatedSpace()) + "byte");
            System.out.println("사용 가능한 공간 : " + (fileStore.getUsableSpace()) + "byte");
            System.out.println();
        }
        System.out.println("파일 구분자 : " +fileSystem.getSeparator());
        System.out.println();

        for(Path path : fileSystem.getRootDirectories()){
            System.out.println(path.toString());
        }


    }
}
