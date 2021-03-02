package sec18.exam_01_inputAndOutputStream;

import java.io.*;

public class DadaInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test/primitive.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("김자바");
        dos.writeDouble(91.7);
        dos.writeInt(2);

        dos.flush(); dos.close();fos.close();

        FileInputStream fis = new FileInputStream("test/primitive.dat");
        DataInputStream dis = new DataInputStream(fis);

        for (int i=0; i<2; i++){
            String name = dis.readUTF();
            double score = dis.readDouble();
            int grage = dis.readInt();

            System.out.println(name + score + grage);
        }
        dis.close();fis.close();
    }
}
