package sec19.exam_01_network.udp;

import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveExample extends Thread{
    public static void main(String[] args) throws SocketException, InterruptedException {
        DatagramSocket datagramSocket = new DatagramSocket(5001); // 5001번 포트에서 수신하는 datagramSocket 생성

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("수신시작");
                try {
                    while (true){
                        DatagramPacket packet = new DatagramPacket(new byte[100], 100 );
                        datagramSocket.receive(packet);     // datagramPacket 수신

                        String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
                        System.out.println("발신인 : " + packet.getAddress());
                        System.out.println("받은내용 : " + data);

                    }
                } catch (Exception e){
                    System.out.println("[수신 종료]");
                }
            }
        };

        thread.start();

        Thread.sleep(10000);
        datagramSocket.close();
    }
}
