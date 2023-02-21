package ru.hbb.game.newyeargame.QestionScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import ru.hbb.game.newyeargame.Game.GameController.GameController;
import ru.hbb.game.newyeargame.Game.GameData;
import ru.hbb.game.newyeargame.SoundSystem.SoundManager;

import java.io.IOException;
import java.util.ResourceBundle;

public class AnsController {

    @FXML
    private Text Ans;

    @FXML
    private Text lbl;

    @FXML
    void false_ans(ActionEvent event) throws IOException {
        GameController.getInstance().COMMANDS.get(GameController.getInstance().queue).addPoints(-1 * ((GameController.getInstance().cur_question.getId() % 5) != 0 ? (GameController.getInstance().cur_question.getId() % 5) : 5) * 100);
        GameController.getInstance().nextQueue();
        GameController.getInstance().checkNewRaund();
        if (GameData.getInstance().getRaund() > GameData.getInstance().getRaunds_amount()){
            GameController.getInstance().changeScene("end", true);
        }else {
            SoundManager.getInstance().playSystemSound("answer_wrong.wav");
            GameController.getInstance().changeScene("game", true);
        }
    }

    @FXML
    void true_ans(ActionEvent event) throws IOException {
        GameController.getInstance().COMMANDS.get(GameController.getInstance().queue).addPoints(((GameController.getInstance().cur_question.getId() % 5) != 0 ? (GameController.getInstance().cur_question.getId() % 5) : 5) * 100);
        GameController.getInstance().nextQueue();
        GameController.getInstance().checkNewRaund();
        if (GameData.getInstance().getRaund() > GameData.getInstance().getRaunds_amount()){
            GameController.getInstance().changeScene("end", true);
        }else {
            SoundManager.getInstance().playSystemSound("aplodis.wav");
            GameController.getInstance().changeScene("game", true);
        }
    }

    @FXML
    void initialize() {
        String[] data = GameController.getInstance().cur_question.getAns().split("@");
        for (String line : data) {
            Ans.setText(Ans.getText() + "\n" + line);
        }
        lbl.setText(lbl.getText().replace("{team}", GameController.getInstance().COMMANDS.get(GameController.getInstance().queue).getName()));
    }

}
