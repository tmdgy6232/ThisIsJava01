package sec15.exam_01_collection.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSNS", "신용권"));
        messageQueue.offer(new Message("sendKaKaotalk", "홍두꼐"));

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch(message.command){
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSNS":
                    System.out.println(message.to + "님에게 SNS를 보냅니다.");
                    break;
                case "sendKaKaotalk":
                    System.out.println(message.to + "님에게 카톡을 보냅니다.");
                    break;
            }
        }

    }
}
