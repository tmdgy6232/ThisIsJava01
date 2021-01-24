package sec17.exam_01_JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(Thread.currentThread().getName() + " : start()메서드 호출 ");
        primaryStage.show();    // 윈도우 보여주기
    }

    @Override
    public void init() throws Exception {
        System.out.println(Thread.currentThread().getName() + " : init()메서드 호출");
    }

    @Override
    public void stop() throws Exception {
        System.out.println(Thread.currentThread().getName() + " stop() 메서드 호출");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() method call");
        launch(args);
    }
}
