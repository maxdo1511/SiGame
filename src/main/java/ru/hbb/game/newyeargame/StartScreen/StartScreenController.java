package ru.hbb.game.newyeargame.StartScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import ru.hbb.game.newyeargame.Commands.Command;
import ru.hbb.game.newyeargame.Game.GameController.GameController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartScreenController {

    @FXML
    private VBox table;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    @FXML
    void start(ActionEvent event) {
    }

    @FXML
    void addInfo(ActionEvent event) {
        if (!((TextField) table.getChildren().get(table.getChildren().size() - 1)).getText().equalsIgnoreCase("")){
            TextField textField = new TextField();
            textField.setId("info_" + table.getChildren().size());
            textField.setAlignment(Pos.TOP_CENTER);
            textField.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
            textField.setOpacity(0.89);
            textField.setFont(new Font("System Bold", 20.0));
            table.getChildren().add(textField);
        }
    }

    @FXML
    void start_button(ActionEvent event) throws IOException {
        GameController gameController = GameController.getInstance();
        for (Node textField : table.getChildren()){
            String name = ((TextField) textField).getText();
            if (!name.equalsIgnoreCase("")) {
                gameController.COMMANDS.add(new Command(name));
            }
        }

        gameController.changeScene("game", true);
    }

    @FXML
    void initialize() {
        TextField textField = new TextField();
        textField.setId("info_" + table.getChildren().size());
        textField.setAlignment(Pos.TOP_CENTER);
        textField.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        textField.setOpacity(0.89);
        textField.setFont(new Font("System Bold", 20.0));
        table.getChildren().add(textField);
    }

}
