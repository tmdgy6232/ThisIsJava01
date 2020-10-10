package sec10.exam_01_Exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "array.array1";
        args = str.split(".");
        System.out.println(args.toString());
        String data1 = args[0];
        String data2 = args[1];

    }
}
