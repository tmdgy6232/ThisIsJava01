package sec11.exam_01_Api;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        // Key 객체를 식별키로 사용해서 String값응ㄹ 저장하는 해쉬맵 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        // 식별키 new Key1으로 홍길동을 저장함
        hashMap.put(new Key(1), "홍길동");

        // 식별키 new Key(1)으로 홍길동을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
