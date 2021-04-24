package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPage implements Initializable{

//    @FXML
//    private Button SUBMIT_BUTTON;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent mainPage_Lecturer = FXMLLoader.load(getClass().getResource("MainPage_Lecturer.fxml"));
        Scene mainPage_LecturerScene = new Scene(mainPage_Lecturer);
        Stage main_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        main_stage.setScene(mainPage_LecturerScene);
        main_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
