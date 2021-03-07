package sec19.exam_01_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 주소 : " + local.getHostAddress());
            System.out.println("내 컴퓨터 주소 : " + local.getAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress ia : iaArr){
                System.out.println("www.naver.com 주소 : " + ia.getHostAddress());
            }
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
