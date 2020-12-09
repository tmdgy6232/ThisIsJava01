package sec15.exam_01_collection.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    /**
     *  Vector
     *  ArrayList와 같은 구조를 가지고 있으나 다른점은 동기화된(synchronized) 메소드로 구성되어 있기 때문에
     *  멀티 스레드가 동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다.
     *  그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. 이것을 스레드가 안전(Thread Safe)하다 한다.
     * */

    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        for(int i=1; i<=5; i++){
            list.add(new Board("제목" + i, "내용" +i,"글쓴이"+i));
        }
        list.remove(2);
        list.remove(3);

        for (int i=0; i< list.size(); i++){
            Board board = list.get(i);
            
            System.out.println(board.subject + board.content + board.writer);
        }
    }
}
