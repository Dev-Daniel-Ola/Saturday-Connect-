package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class UserTypeController {
    @FXML
    private Button registerButton;
    @FXML
    private ComboBox<String>userTypeComboBox;
    @FXML
    public void initialize(){
        ObservableList<String>userType = FXCollections.observableArrayList("Venue Owner", "Event Host/Organiser", "Attendee");
        userTypeComboBox.setItems(userType);
    }
    public void onRegisterButton(ActionEvent e) throws Exception{
        String selectedType = userTypeComboBox.getValue();

        if(selectedType != null){
            UserTypeExtension.handleUserTypeSelection(selectedType);
            
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Detail");
            alert.setContentText("Enter User Type");
            alert.showAndWait();
        }
    }
}
