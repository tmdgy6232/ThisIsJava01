package sec15.exam_01_collection.StackAndQueue;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop();  // 가장 위 객체를 꺼내온 후 삭제
            System.out.println("꺼내온동전 : " + coin.getValue());
        }
    }
}
