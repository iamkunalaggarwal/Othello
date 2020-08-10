package com.example.othello;

public class Player {
    private COLOR color;

    public Player (COLOR color) {
        this.color = color;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }
}