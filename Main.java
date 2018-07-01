package fxcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Activity.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Kalkulator v2");
        stage.setScene(scene);
        Image applicationIcon = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(applicationIcon);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
