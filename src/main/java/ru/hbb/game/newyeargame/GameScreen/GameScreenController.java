package ru.hbb.game.newyeargame.GameScreen;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.OverrunStyle;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import ru.hbb.game.newyeargame.Commands.Command;
import ru.hbb.game.newyeargame.Game.GameController.GameController;
import ru.hbb.game.newyeargame.Game.GameData;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class GameScreenController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private VBox box_1;
        
        @FXML
        private VBox command_table;

        @FXML
        private URL location;

        @FXML
        private Button B_0;

        @FXML
        private Button B_1;

        @FXML
        private Button B_10;

        @FXML
        private Button B_11;

        @FXML
        private Button B_12;

        @FXML
        private Button B_13;

        @FXML
        private Button B_14;

        @FXML
        private Button B_15;

        @FXML
        private Button B_16;

        @FXML
        private Button B_17;

        @FXML
        private Button B_18;

        @FXML
        private Button B_19;

        @FXML
        private Button B_2;

        @FXML
        private Button B_20;

        @FXML
        private Button B_21;

        @FXML
        private Button B_22;

        @FXML
        private Button B_23;

        @FXML
        private Button B_3;

        @FXML
        private Button B_4;

        @FXML
        private Button B_5;

        @FXML
        private Button B_6;

        @FXML
        private Button B_7;

        @FXML
        private Button B_8;

        @FXML
        private Button B_9;

        @FXML
        private Button command_button_0;

        @FXML
        private Button pressed_B_24;

        @FXML
        private ScrollBar scroll;

        @FXML
        private Text theme_0;

        @FXML
        private Text theme_1;

        @FXML
        private Text theme_2;

        @FXML
        private Text theme_3;

        @FXML
        private Text theme_4;

        @FXML
        void command_button_pressed_0(ActionEvent event) {

        }

        @FXML
        void pressed_B_0(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(1)){
                        return;
                }
                GameController.getInstance().showQuestionScene(1);
        }

        @FXML
        void pressed_B_1(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(2)){
                        return;
                }
                GameController.getInstance().showQuestionScene(2);
        }

        @FXML
        void pressed_B_10(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(11)){
                        return;
                }
                GameController.getInstance().showQuestionScene(11);
        }

        @FXML
        void pressed_B_11(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(12)){
                        return;
                }
                GameController.getInstance().showQuestionScene(12);
        }

        @FXML
        void pressed_B_12(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(13)){
                        return;
                }
                GameController.getInstance().showQuestionScene(13);
        }

        @FXML
        void pressed_B_13(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(14)){
                        return;
                }
                GameController.getInstance().showQuestionScene(14);
        }

        @FXML
        void pressed_B_14(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(15)){
                        return;
                }
                GameController.getInstance().showQuestionScene(15);
        }

        @FXML
        void pressed_B_15(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(16)){
                        return;
                }
                GameController.getInstance().showQuestionScene(16);
        }

        @FXML
        void pressed_B_16(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(17)){
                        return;
                }
                GameController.getInstance().showQuestionScene(17);
        }

        @FXML
        void pressed_B_17(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(18)){
                        return;
                }
                GameController.getInstance().showQuestionScene(18);
        }

        @FXML
        void pressed_B_18(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(19)){
                        return;
                }
                GameController.getInstance().showQuestionScene(19);
        }

        @FXML
        void pressed_B_19(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(20)){
                        return;
                }
                GameController.getInstance().showQuestionScene(20);
        }

        @FXML
        void pressed_B_2(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(3)){
                        return;
                }
                GameController.getInstance().showQuestionScene(3);
        }

        @FXML
        void pressed_B_20(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(21)){
                        return;
                }
                GameController.getInstance().showQuestionScene(21);
        }

        @FXML
        void pressed_B_21(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(22)){
                        return;
                }
                GameController.getInstance().showQuestionScene(22);
        }

        @FXML
        void pressed_B_22(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(23)){
                        return;
                }
                GameController.getInstance().showQuestionScene(23);
        }

        @FXML
        void pressed_B_23(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(24)){
                        return;
                }
                GameController.getInstance().showQuestionScene(24);
        }

        @FXML
        void pressed_B_24(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(25)){
                        return;
                }
                GameController.getInstance().showQuestionScene(25);
        }

        @FXML
        void pressed_B_3(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(4)){
                        return;
                }
                GameController.getInstance().showQuestionScene(4);
        }

        @FXML
        void pressed_B_4(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(5)){
                        return;
                }
                GameController.getInstance().showQuestionScene(5);
        }

        @FXML
        void pressed_B_5(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(6)){
                        return;
                }
                GameController.getInstance().showQuestionScene(6);
        }

        @FXML
        void pressed_B_6(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(7)){
                        return;
                }
                GameController.getInstance().showQuestionScene(7);
        }

        @FXML
        void pressed_B_7(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(8)){
                        return;
                }
                GameController.getInstance().showQuestionScene(8);
        }

        @FXML
        void pressed_B_8(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(9)){
                        return;
                }
                GameController.getInstance().showQuestionScene(9);
        }

        @FXML
        void pressed_B_9(ActionEvent event) {
                if (GameController.getInstance().buttons.contains(10)){
                        return;
                }
                GameController.getInstance().showQuestionScene(10);
        }

        @FXML
        public void syncTeams(){
                int i = 0;
                for (Node node : command_table.getChildren()){
                        node.setStyle("-fx-background-color: #fff;");
                        if (i == GameController.getInstance().queue){
                                node.setStyle("-fx-background-color: #959a9e;");
                        }
                        i++;
                }
        }

        @FXML
        void initialize() {
                GameController gameController = GameController.getInstance();
                Map<String, Object> objs = (Map<String, Object>) GameData.getInstance().THEMES_DATA.get(GameData.getInstance().getRaund());
                theme_0.setText(objs.get("theme_1").toString());
                theme_1.setText(objs.get("theme_2").toString());
                theme_2.setText(objs.get("theme_3").toString());
                theme_3.setText(objs.get("theme_4").toString());
                theme_4.setText(objs.get("theme_5").toString());
                int i = 0;
                for (Command command : gameController.COMMANDS) {
                        Button button = new Button();
                        if (i == 0){
                                button.setStyle("-fx-background-color: #959a9e;");
                        }
                        button.setText(command.getName() + "\n" + command.getPoints());
                        button.setFont(new Font("Bell MT Bold", 28.0));
                        button.setMnemonicParsing(false);
                        button.setPrefHeight(180.0);
                        button.setPrefWidth(390.0);
                        button.setTextAlignment(TextAlignment.CENTER);
                        button.setTextFill(Paint.valueOf("#a811d6"));
                        button.setTextOverrun(OverrunStyle.CLIP);
                        button.setWrapText(true);
                        int finalI = i;
                        button.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {
                                        GameController.getInstance().setQueue(finalI);
                                        for (Node node : command_table.getChildren()){
                                                node.setStyle("-fx-background-color: #fff;");
                                        }
                                        button.setStyle("-fx-background-color: #959a9e;");
                                }
                        });
                        i++;
                        command_table.getChildren().add(button);
                }
                int b_id = 1;
                for (Node node : box_1.getChildren()){
                        if (node instanceof HBox){
                             HBox hBox = (HBox) node;
                             for (Node button : hBox.getChildren()){
                                     if (button instanceof Button){
                                             if (GameController.getInstance().buttons.contains(b_id)) {
                                                     ((Button) button).setText("");
                                                     button.setStyle("-fx-background-color: #2b2a2a");
                                             }
                                        b_id++;
                                     }
                             }
                        }
                }
                syncTeams();
        }

}
