package entities;

public class Produto {
    protected String name;
    protected double price;
    protected int quantidade;

    public Produto() {

    }

    public Produto(String name, double price, int quantidade) {
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double precoTotal() {
        return quantidade * price;
    }

    public String toString() {
        return name + " " + price + " " + quantidade;
    }
}
