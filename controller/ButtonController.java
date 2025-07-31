package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.Node;
import java.io.IOException;

public class ButtonController {
    @FXML
    public void signUpController(ActionEvent e) throws IOException {
        Parent signUpRoot = FXMLLoader.load(getClass().getResource("/loginInterface/UserTypeLayout.fxml"));
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(signUpRoot);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void loginController(ActionEvent ex){

    }
}
