package sec18.exam_01_inputAndOutputStream;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileExample {
    public static void main(String[] args) throws URISyntaxException, IOException {
        File dir = new File("Users/imseunghyo/Desktop/ThisisJava01/test");
        File test01 = new File("./test01.txt");
        File test02 = new File("/Users/imseunghyo/Desktop/ThisisJava01/test02.txt");
        File test03 = new File(new URI("file:///Users/imseunghyo/Desktop/ThisisJava01/test03.txt"));

        if (dir.exists() == false) dir.mkdir();
        if (test01.exists() == false) test01.createNewFile();
        if (test02.exists() == false) test02.createNewFile();
        if (test03.exists() == false) test03.createNewFile();

        File temp = new File(".");
        File[] contents = temp.listFiles();
        for (File file : contents){
            System.out.println(file.getName());
        }

    }
}
