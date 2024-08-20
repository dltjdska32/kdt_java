module hello.demo4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.se;

    opens hello.demo4 to javafx.fxml;
    exports hello.demo4;
}