package sec19.exam_01_network;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.nio.file.*;
import java.util.List;

public class WatchServiceExample extends Application {


    class WatchServiceThread extends Thread {   // watchservicethread 클래스선언
        @Override
        public void run() {
            try {
                WatchService watchService = FileSystems.getDefault().newWatchService();
                Path directory = Paths.get("test/test1");

                directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

                while (true){
                    WatchKey watchKey = watchService.take(); // 블로킹 watchKey가 큐에 들어올 때까지
                    List<WatchEvent<?>> list = watchKey.pollEvents(); // get watchevent list
                    for (WatchEvent watchEvent : list){
                        // get event kind
                        WatchEvent.Kind kind = watchEvent.kind();

                        // get event path
                        Path path = (Path) watchEvent.context();
                        if (kind == StandardWatchEventKinds.ENTRY_CREATE){ // 생성되었을 경우 실행할 코드
                            Platform.runLater(() -> textArea.appendText("파일 생성됨 -> " + path.getFileName() + "\n"));
                        }
                        if (kind == StandardWatchEventKinds.ENTRY_MODIFY){ // 변경되었을 경우 실행할 코드
                            Platform.runLater(() -> textArea.appendText("파일 변경됨 -> " + path.getFileName() + "\n"));
                        }
                        if (kind == StandardWatchEventKinds.ENTRY_DELETE){ // 삭제되었을 경우 실행할 코드
                            Platform.runLater(() -> textArea.appendText("파일 삭제됨 -> " + path.getFileName() + "\n"));
                        }
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    TextArea textArea;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPrefSize(500, 300);

        textArea = new TextArea();
        textArea.setEditable(false);
        root.setCenter(textArea);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("watchserviceExample");
        primaryStage.show();

        WatchServiceThread wst = new WatchServiceThread();
        wst.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
