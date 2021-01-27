package sec17.exam_01_JavaFX.event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMainEvent extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();
        hBox.setPrefSize(200, 50);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(20);

        Button btn1 = new Button("버튼1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("버튼 1");
            }
        });

        Button btn2 = new Button("button2");
        btn2.setOnAction(event -> {
            System.out.println(" click the button2");
        });

        hBox.getChildren().addAll(btn1, btn2);      // hBox에 btn1, btn2를 추가
        Scene scene = new Scene(hBox);

        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
