package entities;

public class Produto {
    public String name;
    public double price;
    public int stock;

    public double totalValueInStock () {
        return price * stock;
    }

    public void adicionarEstoque(int quantidade) {
        stock += quantidade;
    }

    public void removerEstoque(int quantidade) {
        stock -= quantidade;
    }

    public String toString() {
        return "Nome: " + name + "\nEstoque: " + stock + "\nPreço: R$" + String.format("%.2f",price);
    }
}
