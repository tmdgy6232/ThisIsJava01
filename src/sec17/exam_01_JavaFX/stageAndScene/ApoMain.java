package sec17.exam_01_JavaFX.stageAndScene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ApoMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();         // Parent 하위 객체인 vBox 생성
        root.setPrefWidth(350);         // vbox 폭 설정
        root.setPrefHeight(150);        // vbox 높이 설정
        root.setAlignment(Pos.CENTER);  // 컨트롤을 중앙으로 정렬
        root.setSpacing(20);            // 컨트롤의 수직 간

        Label label = new Label();      // create Label Control
        label.setText("Hello, JavaFX"); // text 속성 설정
        label.setFont(new Font(50)); // font 속성 설정

        Button button = new Button();   // create button control
        button.setText("확인");       // Text 속성 설정
        button.setOnAction(event -> Platform.exit());   // 클릭 처리 이벤트

        root.getChildren().add(label);  // vBoxdml 자식으로 라벨컨트롤 추가
        root.getChildren().add(button); // vbox의 자식으로 버튼 컨트롤 추가

        Scene scene = new Scene(root);      // vBox를 루트 컨테이너로 해서 scene 생성

        primaryStage.setTitle("승효의 AppMain"); // 윈도우의 제목 설정
        primaryStage.setScene(scene);       // 윈도우에 장면 설정
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
