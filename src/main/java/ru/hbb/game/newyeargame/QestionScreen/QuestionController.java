package ru.hbb.game.newyeargame.QestionScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import ru.hbb.game.newyeargame.Game.GameController.GameController;
import ru.hbb.game.newyeargame.Game.GameData;
import ru.hbb.game.newyeargame.SoundSystem.SoundManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class QuestionController {

    @FXML
    private Text question;

    @FXML
    private Text lbl;

    @FXML
    private ImageView img;

    @FXML
    void go_ans(ActionEvent event) throws IOException {
        GameController.getInstance().showAnsScene();
    }

    @FXML
    void initialize() throws FileNotFoundException {
        String[] data = GameController.getInstance().cur_question.getText().split("@");
        for (String line : data) {
            question.setText(question.getText() + "\n" + line);
        }
        lbl.setText(lbl.getText().replace("{team}", GameController.getInstance().COMMANDS.get(GameController.getInstance().queue).getName()));
        if (GameController.getInstance().cur_question.getType().equals(QuestionType.IMAGE)){
            try {
                img.setImage(new Image(getClass().getClassLoader().getResourceAsStream(GameController.getInstance().cur_question.getImg())));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        if (GameController.getInstance().cur_question.getType().equals(QuestionType.AUDIO)){
            SoundManager.getInstance().playSound(GameController.getInstance().cur_question.getSound());
        }
    }

}
