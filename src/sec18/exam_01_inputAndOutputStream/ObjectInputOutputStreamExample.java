package sec18.exam_01_inputAndOutputStream;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("src/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Integer(10));
        oos.writeObject(new Double(3.14));
        oos.writeObject(new int[]{1, 2, 3});;
        java.lang.String string = "임승효";
        oos.writeObject(string);

        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("src/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer obj1 = (Integer) ois.readObject();
        double obj2 = (Double) ois.readDouble();
        int[] obj3 = (int[]) ois.readObject();
        String obj4 = (String) ois.readObject();

        ois.close(); fis.close();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}
