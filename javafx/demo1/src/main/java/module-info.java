module hello.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.se;


    opens hello.demo1 to javafx.fxml;
    exports hello.demo1;
}