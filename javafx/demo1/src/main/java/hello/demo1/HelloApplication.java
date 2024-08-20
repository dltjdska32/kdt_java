package hello.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

     /*   HBox root = new HBox();
        root.setPadding(new Insets(50, 10, 10, 50));
        Button btn = new Button();
        btn.setPrefSize(100, 100);

        root.getChildren().add(btn);
        Scene scene = new Scene(root);*/

        HBox hbox = new HBox();
        Button button = new Button();
        button.setPrefSize(100, 100);
        HBox.setMargin(button, new Insets(10, 10, 50, 50));
        hbox.getChildren().add(button);
        Scene scene = new Scene(hbox);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        try {
            launch();
        } catch (Exception e) {}
    }
}