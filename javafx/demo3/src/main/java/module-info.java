module hello.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.se;


    opens hello.demo3 to javafx.fxml;
    exports hello.demo3;
}