module hello.demo6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hello.demo6 to javafx.fxml;
    exports hello.demo6;
}