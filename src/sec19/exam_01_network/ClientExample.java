package sec19.exam_01_network;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;

        try{
            socket = new Socket();  // socket 생성
            System.out.println("연결요청");
            socket.connect(new InetSocketAddress("localhost", 5001));   // 연결요청
            System.out.println("[연결완료]");
        } catch (Exception e){}

        if(socket.isClosed()){  // 연결되어있을 경우
            try {
                socket.close(); // disconnect
            } catch (Exception e){}
        }
    }
}
