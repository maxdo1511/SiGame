package ru.hbb.game.newyeargame.GameEndController;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import ru.hbb.game.newyeargame.Game.GameController.GameController;

import java.net.URL;
import java.util.ResourceBundle;

public class GameEndController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text winner;

    @FXML
    void initialize() {
        winner.setText(GameController.getInstance().getWinner().getName());
    }

}
