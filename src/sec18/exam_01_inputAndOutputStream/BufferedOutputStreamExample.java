package sec18.exam_01_inputAndOutputStream;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("test/5-2.jpg");
        bis = new BufferedInputStream(fis);

        fos = new FileOutputStream("test/5-4.jpg");
        start = System.currentTimeMillis();
        while ( (data = bis.read()) != -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        System.out.println("사용하지 않았을 떄 : "+ (end - start) + "ms");
        fos.close(); bis.close(); fis.close();

        fis = new FileInputStream("test/5-2.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("test/5-4.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();

        while ( (data = bis.read()) != -1){
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();

        bos.close();fos.close();bis.close();fis.close();

        System.out.println("사용하였을 때 : " + (end - start ) + "ms");
    }
}
