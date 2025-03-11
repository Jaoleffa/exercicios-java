package entities;

public class Produtos {
    private String name;
    private double price;

    public Produtos(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Nome: " + name + "\nPreço: R$" + price;
    }
}
