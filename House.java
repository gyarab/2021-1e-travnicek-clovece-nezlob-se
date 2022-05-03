package com.example.tip2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class House {
    private Circle[] circles;
    private int tokens;
    private Color color;

    public House(Circle first, Circle second, Circle third, Circle fourth, Color color) {
        this.circles = new Circle[4];
        circles[0] = first;
        circles[1] = second;
        circles[2] = third;
        circles[3] = fourth;

        this.color = color;
        this.tokens = 4;
    }

    public int getTokens() {
        return tokens;
    }

    public Color getColor() {
        return color;
    }

    public void getOneToken() {
        tokens = tokens - 1;
        updateUi();
    }

    public void addOneToken() {
        tokens = tokens + 1;
        updateUi();
    }


    private void updateUi() {
        for (int i = 0; i < 4; i++) {
            if (i < tokens) {
                circles[i].setFill(this.color);
            } else {
                circles[i].setFill(Color.GRAY);
            }
        }
    }
}