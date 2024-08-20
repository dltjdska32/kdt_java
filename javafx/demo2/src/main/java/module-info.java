module hello.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hello.demo2 to javafx.fxml;
    exports hello.demo2;
}