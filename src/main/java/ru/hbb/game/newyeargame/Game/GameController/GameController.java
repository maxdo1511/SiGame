package ru.hbb.game.newyeargame.Game.GameController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.hbb.game.newyeargame.Commands.Command;
import ru.hbb.game.newyeargame.Game.GameData;
import ru.hbb.game.newyeargame.GameScreen.GameScreenController;
import ru.hbb.game.newyeargame.NewYearApplication;
import ru.hbb.game.newyeargame.QestionScreen.Question;
import ru.hbb.game.newyeargame.QestionScreen.QuestionType;
import ru.hbb.game.newyeargame.SoundSystem.SoundManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class GameController {

    public static GameController instance;
    public Scene CUR_SCENE;
    public Stage stage;
    public ArrayList<Integer> buttons = new ArrayList<>();
    public ArrayList<Command> COMMANDS = new ArrayList<>();
    public int queue;
    public Question cur_question;
    public GameScreenController controller;

    public GameController(){
        instance = this;
    }

    public void changeScene(String id, boolean full_screen) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NewYearApplication.class.getResource(id + ".fxml"));
        CUR_SCENE = new Scene(fxmlLoader.load());
        if (id.equalsIgnoreCase("game")){
            controller = fxmlLoader.getController();
        }
        stage.setScene(CUR_SCENE);
        if (stage.isFullScreen() != full_screen) {
            stage.setFullScreen(full_screen);
        }
    }

    public void showAnsScene() throws IOException {
        changeScene("ans", true);
    }

    public void showQuestionScene(int id){
        try {
            cur_question = new Question(id);
            GameController.getInstance().buttons.add(id);
            if (cur_question.getType().equals(QuestionType.TEXT) || cur_question.getType().equals(QuestionType.AUDIO)) {
                changeScene("question", true);
                SoundManager.getInstance().playSystemSound("round_begin.wav");
            }
            if (cur_question.getType().equals(QuestionType.IMAGE)) {
                changeScene("question_img", true);
                SoundManager.getInstance().playSystemSound("round_begin.wav");
            }
        }catch (Exception e){

        }
    }

    public void checkNewRaund(){
        if (GameController.getInstance().buttons.size() == 3){
            GameController.getInstance().buttons.clear();
            GameData.getInstance().addRaund();
        }
    }

    public void nextQueue(){
        if (queue < COMMANDS.size() - 1){
            queue++;
        }else {
            queue = 0;
        }
    }

    public Command getWinner(){
        Command winner = COMMANDS.get(0);
        for (int i = 1; i < COMMANDS.size(); i++){
            if (winner.getPoints() < COMMANDS.get(i).getPoints()){
                winner = COMMANDS.get(i);
            }
        }
        return winner;
    }

    public void setQueue(int queue){
        this.queue = queue;
    }

    public static GameController getInstance(){
        return instance;
    }

}
