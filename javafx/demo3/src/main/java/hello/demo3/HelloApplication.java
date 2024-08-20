package hello.demo3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        HBox root = new HBox();
        root.setPrefSize(800, 600);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);


        Button btn1 = new Button("btn1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("버튼1 클릭");
            }
        });
        
        Button btn2 = new Button("btn2");
        btn2.setOnAction(e -> System.out.println("btn2 클릭"));

        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        Scene scene = new Scene(root);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setOnCloseRequest(e -> System.out.println("종료버튼"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}