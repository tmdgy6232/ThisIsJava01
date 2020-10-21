package sec11.exam_01_Api.NewInstance;

public class SendAction implements Action{

    @Override
    public void excuete() {
        System.out.println("데이터를 보냅니다.");
    }
}
