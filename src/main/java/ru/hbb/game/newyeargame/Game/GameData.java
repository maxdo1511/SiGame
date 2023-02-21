package ru.hbb.game.newyeargame.Game;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public final class GameData {

    private static GameData instance;
    public Map<Integer, Map<String, Object>> THEMES_DATA = new HashMap<>();
    public Map<Integer, Map<String, Object>> RAUNDS_DATA = new HashMap<>();
    private int raund = 1, raunds_amount;
    private String questions_data, raunds_data, sounds_folder, images_folder;

    public GameData() {
        try {
            instance = this;
            raunds_amount = (int) this.readFile("settings.yaml").get("raunds_amount");
            questions_data = (String) this.readFile("settings.yaml").get("questions_data");
            raunds_data = (String) this.readFile("settings.yaml").get("raunds_data");
            sounds_folder = (String) this.readFile("settings.yaml").get("sounds_folder");
            images_folder = (String) this.readFile("settings.yaml").get("images_folder");

            readThemes(raunds_amount);
            readData(raunds_amount);
        }catch (Exception e){
            System.out.println("GameData init error!");
        }
    }

    public Map<String, Object> readFile(String path) throws FileNotFoundException{
        File file = new File(getClass().getClassLoader().getResource(path).getFile());
        try {
            if(!file.exists() && !file.createNewFile()) throw new IOException();
        } catch (IOException e){
            throw new RuntimeException("Failed to create file", e);
        }
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));

        Yaml yaml = new Yaml();
        return yaml.load(inputStream);
    }

    public void readThemes(int raunds_amount){
        try {
            if (raunds_amount == 0){
                return;
            }
            Map<String, Object> data = this.readFile(raunds_data);
            for (int i = 1; i <= raunds_amount; i++){
                this.THEMES_DATA.put(i, (Map<String, Object>) data.get("r_" + i));
            }
        }catch (Exception e){}
    }

    public void readData(int raunds_amount){
        try {
            if (raunds_amount == 0){
                return;
            }
            Map<String, Object> data = this.readFile(questions_data);
            for (int i = 1; i <= raunds_amount; i++){
                this.RAUNDS_DATA.put(i, (Map<String, Object>) data.get("r_" + i));
            }
        }catch (Exception e){
            System.out.println("Data read error!\n" + e.getLocalizedMessage());
        }
    }

    public void addRaund(){
        raund++;
    }

    public int getRaund(){
        return raund;
    }

    public String getImages_folder() {
        return images_folder;
    }

    public String getSounds_folder() {
        return sounds_folder;
    }

    public int getRaunds_amount() {
        return raunds_amount;
    }

    public static GameData getInstance(){
        return instance;
    }

}
