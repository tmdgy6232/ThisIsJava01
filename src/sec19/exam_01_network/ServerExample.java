package sec19.exam_01_network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5001));    //serversocket 생성
            while (true){
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept();      // 클라이언트 연결 수락
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함]" + isa.getAddress());
           }
        } catch (Exception e){}

        if (serverSocket.isClosed()){ // serverSocket이 닫혀있찌 않은 경우
            try {
                serverSocket.close(); // Serversocket 닫기
           } catch (IOException e){}
        }
    }
}
