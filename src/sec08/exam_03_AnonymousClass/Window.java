package sec08.exam_03_AnonymousClass;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    // 필드 초기값으로 대입

    Button.OnclickListener listener = new Button.OnclickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };
    Window(){
        button1.setOnclickListener(listener);
        button2.setOnclickListener(new Button.OnclickListener() {
            @Override
            public void onClick() {
                System.out.println("메세지를 보냅니다.");
            }
        });
    }
}
