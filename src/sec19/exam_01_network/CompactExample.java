package sec19.exam_01_network;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class CompactExample {
    public static void main(String[] args) {
        System.out.println("[7바이트 크기로 버퍼 생성]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        buffer.put((byte)1);
        buffer.put((byte)2);
        buffer.put((byte)3);
        buffer.put((byte)4);
        buffer.put((byte)5);

        buffer.flip();// 데이터를 읽기 위해 위치 속성값 변경
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("3바이트 읽음");
        printState(buffer);

        buffer.compact();
        System.out.println("compact() 실행 후 ");
        printState(buffer);

    }

    public static void printState(ByteBuffer buffer){
        System.out.print(buffer.get(0) + ", ");
        System.out.print(buffer.get(1) + ", ");
        System.out.print(buffer.get(2) + ", ");
        System.out.print(buffer.get(3) + ", ");
        System.out.println(buffer.get(4) + ", ");
        System.out.print("position : " + buffer.position()+ ", ");
        System.out.print("limit : " + buffer.limit()+ ", ");
        System.out.println("capacity : " + buffer.capacity());
    }
}
