package entities;

public class BancoAccount {
    private int numeroConta;
    private String name;
    private double valorConta;

    public BancoAccount (int numeroConta, String name, double valorConta) {
        this.numeroConta = numeroConta;
        this.name = name;
        this.valorConta = valorConta;
    }
    public BancoAccount (int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getValorConta() {
        return valorConta;
    }

    public String toString() {
        return "Account number: " + numeroConta + "\nNome do titular: " + name + "\nValor na conta: R$" + valorConta;
    }

    public void adicionarValor(double valor) {
        this.valorConta += valor;
    }

    public void realizarSaque(double valor) {
        this.valorConta = valorConta - valor - 5.00;
    }

}
