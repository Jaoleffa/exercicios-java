package entities;

import entities.enums.Color;

import java.awt.*;

public class Rectangle extends Shape{
    protected double width;
    protected double heigth;

    public Rectangle() {

    }

    public Rectangle(Double width, Double heigth, Color color) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return width * heigth;
    }
}
