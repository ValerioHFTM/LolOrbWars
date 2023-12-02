package com.lolorbwars;

import java.util.HashMap;

import javafx.scene.paint.Color;

// This is the player
public class Player {
    private int index;
    private HashMap<String, Integer> playerCoordinates = new HashMap<>();
    private Shapes form;
    private Color color;

    public Player(int index, Color color, Integer x, Integer y) {
        this.index = index;
        this.color = color;
        this.playerCoordinates.put("x", x);
        this.playerCoordinates.put("y", y);
    }

    public void setForm(Shapes newForm) {
        System.out.println("whatamI???" + newForm);
        this.form = newForm;
    }

    public Shapes getForm() {
        System.out.println("am I still waht i say i am ?" + form);
        return form;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPlayerCoordinates(String axis) {
        return playerCoordinates.get(axis);
    }

    public void setPlayerCoordinates(HashMap<String, Integer> playerCoordinates) {
        this.playerCoordinates = playerCoordinates;
    }
}