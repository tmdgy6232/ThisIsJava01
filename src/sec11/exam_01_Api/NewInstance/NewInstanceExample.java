package sec11.exam_01_Api.NewInstance;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            //Class clazz = Class.forName("sec11.exam_01_Api.NewInstance.ReceiveAction");
            Class clazz = Class.forName("sec11.exam_01_Api.NewInstance.SendAction");
            Action action = (Action) clazz.newInstance();
            action.excuete();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
