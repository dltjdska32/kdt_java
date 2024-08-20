module hello.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens hello.demo to javafx.fxml;
    exports hello.demo;
}