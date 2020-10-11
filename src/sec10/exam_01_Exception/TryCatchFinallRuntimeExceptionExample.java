package sec10.exam_01_Exception;

public class TryCatchFinallRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch (Exception e){
            System.out.println("아규먼트가 없습니다.");
        }

        try{
            data1 = args[0];
            data2 = args[1];
        } catch ( java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException a){
            System.out.println("멀티캐치");
        }
    }
}
