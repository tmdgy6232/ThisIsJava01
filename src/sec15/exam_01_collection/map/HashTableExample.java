package sec15.exam_01_collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    /**
     * HashTable
     *
     * 구조나 성능은 HashMap과 다를게 없으나 동기화된(synchronized) 메소드로 구성되어 있기 때문에
     * 멀티스레드가 동시에 이 메소드들을 실행할 수는 없고 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다.
     * */
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();

        // 아이디와 비밀번호를 미리 저장시킨다.
        map.put("spring", 12);
        map.put("summer", 123);
        map.put("fall", 1234);
        map.put("winter", 12345);

        Scanner scanner = new Scanner(System.in); // 키보드로부터 입력된 내용을 받기 위해 생성
        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요");
            System.out.println("아이디 : ");
            String id = scanner.nextLine();

            System.out.println("비밀번호 : ");
            String password = scanner.nextLine();
            System.out.println();

            if (map.containsKey(id)){
                if (map.get(id) == Integer.valueOf(password)){
                    System.out.println("로그인 되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
        }

    }
}
