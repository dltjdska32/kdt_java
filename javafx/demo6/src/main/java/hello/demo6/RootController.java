package hello.demo6;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private TextField txtTitle;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private ComboBox<String> comboPublic;

    @FXML
    private DatePicker dateExit;

    @FXML
    private TextArea txtContent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void handleBtnRegAction(ActionEvent e) {
        String title = txtTitle.getText();
        System.out.println("Title: " + title);

        String password = txtPassword.getText();
        System.out.println("Password: " + password);

        String strPublic = comboPublic.getValue();
        System.out.println("Public: " + strPublic);

        LocalDate localDate = dateExit.getValue();
        if(localDate != null) {
            System.out.println("dateExit: " + localDate.toString());
        }

        String content = txtContent.getText();
        System.out.println("Content: " + content);

    }

    public void handleBtnCancelAction(ActionEvent e) {
        Platform.exit();
    }
}
