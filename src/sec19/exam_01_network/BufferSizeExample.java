package sec19.exam_01_network;

import java.nio.ByteBuffer;

public class BufferSizeExample {
    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(600*1024*1024); // 200mb의 버퍼사이즈 생성
        System.out.println("다이렉트 버퍼가 생성되었습니다. " );

        ByteBuffer nondirectBuffer = ByteBuffer.allocate(2000000000);
        System.out.println("넌다이렉트 버퍼가 생성되었습니다.");
    }
}
