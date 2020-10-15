package sec11.exam_01_Api;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;

        for (int i=1; i<=50; i++){
            counter = new Counter(i);

            counter = null; // 쓰레기로 만듬

            System.gc(); // 가비지 컬렉터 호출
        }
    }
}
