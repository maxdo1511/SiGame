module ru.hbb.game.newyeargame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.yaml.snakeyaml;
    requires java.desktop;


    opens ru.hbb.game.newyeargame to javafx.fxml;
    exports ru.hbb.game.newyeargame;
    opens ru.hbb.game.newyeargame.StartScreen to javafx.fxml;
    exports ru.hbb.game.newyeargame.StartScreen;
    opens ru.hbb.game.newyeargame.GameScreen to javafx.fxml;
    exports ru.hbb.game.newyeargame.GameScreen;
    opens ru.hbb.game.newyeargame.QestionScreen to javafx.fxml;
    exports ru.hbb.game.newyeargame.QestionScreen;
    opens ru.hbb.game.newyeargame.GameEndController to javafx.fxml;
    exports ru.hbb.game.newyeargame.GameEndController;
}