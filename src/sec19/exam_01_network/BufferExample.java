package sec19.exam_01_network;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {
    public static void main(String[] args) {
        System.out.println("7바이트 크기로 버퍼 생성");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(7);// create direct buffer
        printState(byteBuffer);

        byteBuffer.put((byte)10); // 상대적 저장
        byteBuffer.put((byte)11); // 상대적 저장
        System.out.println("2바이트 저장 후");
        printState(byteBuffer);

        byteBuffer.put((byte)12); // 상대적 저장
        byteBuffer.put((byte)13); // 상대적 저장
        byteBuffer.put((byte)14); // 상대적 저장
        System.out.println("3바이트 저장 후");
        printState(byteBuffer);

        byteBuffer.flip();  // 데이터를 읽기 위해 읽기 속성값 변경
        System.out.println("flip() 실행 후 ");
        printState(byteBuffer);

        byteBuffer.get(new byte[3]);    // 상대적 읽기
        System.out.println("3바이트 읽은 후 ");
        printState(byteBuffer);

        byteBuffer.mark();  // mark 하기
        System.out.println("--------------현재 위치를 마크해놓음-----------------");

        byteBuffer.get(new byte[2]);        // 2바이트 상대적 읽기
        System.out.println("2바이트 읽은 후");
        printState(byteBuffer);

        byteBuffer.reset(); // 마크 위치로 position 이동
        System.out.println("=================position을 마크 위치로 옮김");
        printState(byteBuffer);

        byteBuffer.rewind();    // position을 0으로 이동
        System.out.println("rewind 실행 후");
        printState(byteBuffer);

        byteBuffer.clear(); // 모든 위치 속성값 초기화
        System.out.println("clear  실행 후 ");
        printState(byteBuffer);

    }
    public static void printState(Buffer buffer){
        System.out.print("\t Position : " + buffer.position() +",");
        System.out.print("\t limit : " + buffer.limit() +",");
        System.out.println("\t capacity : " + buffer.capacity());
    }
}
