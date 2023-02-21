package ru.hbb.game.newyeargame.QestionScreen;

import ru.hbb.game.newyeargame.Game.GameController.GameController;
import ru.hbb.game.newyeargame.Game.GameData;

public class Question {

    private QuestionType type;
    private String text;
    private String ans;
    private String img;
    private String sound;
    private int id;

    public Question(int id){
        String text_ = (String) GameData.getInstance().RAUNDS_DATA.get(GameData.getInstance().getRaund()).get("q_" + id);
        String[] data = text_.split("//");
        type = QuestionType.valueOf(data[0]);
        text = data[1];
        ans = data[2];
        this.id = id;
        if (data.length > 3){
            if (type.equals(QuestionType.AUDIO)){
                sound = data[3];
            }
            if (type.equals(QuestionType.IMAGE)){
                img = data[3];
            }
        }
    }

    public QuestionType getType() {
        return type;
    }

    public String getAns() {
        return ans;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getSound() {
        return sound;
    }

    public String getText() {
        return text;
    }
}
