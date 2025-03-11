package entities;

public class Rectangle {
    public double width;
    public double heigth;

    public double calculaArea() {
        return width * heigth;
    }

    public double calculaPerimetro() {
        return 2 * (width + heigth);
    }

    public double calculaDiagonal() {
        return Math.sqrt((Math.pow(width, 2) + Math.pow(heigth,2)));
    }
}
