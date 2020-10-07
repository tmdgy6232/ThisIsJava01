package sec08.exam_03_AnonymousClass;

public class Button {
    OnclickListener listener;

    void setOnclickListener(OnclickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }
    interface OnclickListener {
        void onClick();
    }
}
