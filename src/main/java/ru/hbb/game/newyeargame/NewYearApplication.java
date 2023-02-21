package ru.hbb.game.newyeargame;

import javafx.application.Application;
import javafx.stage.Stage;
import ru.hbb.game.newyeargame.Game.GameController.GameController;
import ru.hbb.game.newyeargame.Game.GameData;
import ru.hbb.game.newyeargame.SoundSystem.SoundManager;

import javax.sound.sampled.Clip;
import java.io.IOException;
import java.net.URL;

public class NewYearApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        new GameData();
        new SoundManager();
        new GameController();
        SoundManager.getInstance().playBackGroundMusic("main_menu.wav");
        GameController.getInstance().stage = stage;
        GameController.getInstance().changeScene("start", false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}