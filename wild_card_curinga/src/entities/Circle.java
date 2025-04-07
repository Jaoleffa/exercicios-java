package entities;

public class Circle implements Shape{
    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double pi = 3.14;
        return pi * Math.pow(getRadius(), 2);
    }
}
