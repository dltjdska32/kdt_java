module hello.demo5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hello.demo5 to javafx.fxml;
    exports hello.demo5;
}