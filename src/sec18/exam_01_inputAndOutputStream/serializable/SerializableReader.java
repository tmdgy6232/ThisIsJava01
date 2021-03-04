package sec18.exam_01_inputAndOutputStream.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("test/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassA v = (ClassA) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2.field1 : " + v.file2.field1);
        System.out.println("field3 : " + v.field3);
        System.out.println("field4 : " + v.field4);


    }
}
