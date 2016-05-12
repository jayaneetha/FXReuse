package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class Controller {
    public HBox theHBOX;

    public void add(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("child.fxml"));
            theHBOX.getChildren().add(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
