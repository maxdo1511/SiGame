package ru.hbb.game.newyeargame.Commands;

public class Command {

    private final String name;
    private int points = 0;

    public Command(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int amount){
        points += amount;
    }
}
