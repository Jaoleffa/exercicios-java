package entities;

import entities.enums.Color;

import java.awt.*;

public class Circle extends Shape{
    protected double radius;

    public Circle() {

    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14 * Math.pow(radius, 2);
    }
}
