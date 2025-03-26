package entities;

import entities.enums.Color;

import java.awt.*;

public abstract class Shape {
    protected entities.enums.Color color;

    public Shape() {

    }

    public Shape(entities.enums.Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
