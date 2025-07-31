package controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class UserTypeExtension{
    public static void handleUserTypeSelection(String userType){
        String fxmlFile = "";

        switch(userType){
            case "Attendee":
                fxmlFile = "/loginInterface/AttendeeLayout.fxml";
            break;
            case "Event Host/Oragniser":
                fxmlFile= "";
            break;
            case "Venue Owner":
                fxmlFile = "";
            break;
        }
        try{
            Parent root = FXMLLoader.load(UserTypeExtension.class.getResource(fxmlFile));
            
            Stage stage = new Stage();
            stage.setTitle(userType+" Registration");
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}