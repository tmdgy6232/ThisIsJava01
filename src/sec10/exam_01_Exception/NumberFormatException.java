package sec10.exam_01_Exception;

public class NumberFormatException {
    public static void main(String[] args) {
        String data = "100";
        String failData = "100a";

        int value = Integer.parseInt(data);
        int failValue = Integer.parseInt(failData);

        int result = value + failValue;

        System.out.println(data + "+" + failData + "=" + result);
    }
}
