package controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class AttendeeExtension {
    public static void handleSubmit(String fullName, long number, String email, String password, String confirmPassword, String comboCountry, String comboState, String comboLga){
        String fileFXML = "/loginInterface/AttendeeExtensionLayout.fxml";

        try{
            Parent root = FXMLLoader.load(AttendeeExtension.class.getResource(fileFXML));
            Stage stage = new Stage();
            stage.setTitle("Saturday");
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
