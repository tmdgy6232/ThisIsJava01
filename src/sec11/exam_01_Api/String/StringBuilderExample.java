package sec11.exam_01_Api.String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // STringbuilder 객체 생성

        sb.append("Java");
        sb.append("Program Study");     // 문자열 끝에 추가
        System.out.println(sb.toString());

        sb.insert(4, "2"); // 인덱스 4위치에 2를 삽입
        System.out.println(sb.toString());

        sb.setCharAt(4, '6'); // 인덱스 4위치의 문자를 6으로 변경1
        System.out.println(sb.toString());

        sb.replace(6, 13, "Book"); // 인덱스 6부터 13'전'까지를 book으로 대치
        System.out.println(sb.toString());
        sb.delete(4,5); //인덱스 4~ 5전까지의 문자를 삭제
        System.out.println(sb.toString());
        int length = sb.length(); //총 문자 수 얻기
        System.out.println(length);
        String result = sb.toString(); // 버퍼에 있는것을 string  타입으로 리턴
        System.out.println(result);

    }
}
