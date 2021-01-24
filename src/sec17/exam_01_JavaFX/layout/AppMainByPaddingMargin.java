package sec17.exam_01_JavaFX.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMainByPaddingMargin extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 패딩 설정
        HBox box = new HBox();
        box.setPadding(new Insets(50, 10, 10, 50));
        Button button = new Button();
        button.setPrefSize(100, 100);

        // 마진설정
        /*
        * HBox box = new HBox();
        Button button = new Button();
        button.setPrefSize(100, 100);
        * box.setMargin(button, new Inset(10, 10, 50, 50);
        * */
        box.getChildren().add(button);

        Scene scene = new Scene(box);
        primaryStage.setTitle("메인타이틀");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
