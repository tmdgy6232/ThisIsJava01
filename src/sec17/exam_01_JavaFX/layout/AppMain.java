package sec17.exam_01_JavaFX.layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();     // Hbox 컨테이너 생성 ( 수평으로 만드려면 hbox를 써야하나봄)
        hBox.setPadding(new Insets(10));    // 안쪽 여백 설정
        hBox.setSpacing(10);        // 컨트롤간의 수평 간격 설정

        TextField textField = new TextField();      // TextField 컨트롤 생성
        textField.setPrefWidth(200);                // TextField 폭 설정

        Button button = new Button();               // 버튼 컨트롤 생성
        button.setText("확인");                       // 버튼 글자 생성

        ObservableList list = hBox.getChildren(); // hBox의 observableList 얻기
        list.add(textField);            // textField zjsxmfhf qocl
        list.add(button);               // ㅠbutton 컨트롤 배치

        Scene scene = new Scene(hBox);      // 장면 생성

        primaryStage.setTitle("승효의 mainApp example");   // 윈도우 창 제목 설정
        primaryStage.setScene(scene);   // 윈도우 창에 장면 설정
        primaryStage.show();        // 윈도우 장면 보여주기
    }

    public static void main(String[] args) {
        launch(args);
    }
}
