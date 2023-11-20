package br.gm325.cards;

import static br.gm325.cards.App.loadFXML;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {

    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    private Button playButton;

    @FXML
    void playButtonAction(ActionEvent event) throws IOException {
        Parent root = loadFXML("play");
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}