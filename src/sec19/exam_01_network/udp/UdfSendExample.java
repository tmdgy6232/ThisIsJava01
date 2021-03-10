package sec19.exam_01_network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdfSendExample {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();   // datagramSocket 생성

        System.out.println("발신 시작 ");

        for (int i=1; i<3; i++){
            String data = "메세지" + i;
            byte[] byteArr = data.getBytes("UTF-8");
            DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost", 5001));

            datagramSocket.send(packet);
            System.out.println("보낸 바이트 수 : " + byteArr.length + "byte");
        }
        System.out.println("발신 종료");
        datagramSocket.close();
    }
}
