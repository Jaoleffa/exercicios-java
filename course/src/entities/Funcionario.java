package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double Impostos;

    public double salarioLiquido() {
        return salarioBruto - Impostos;
    }

    public void aumentaSalario(double porcentagem) {
        salarioBruto += (porcentagem / 100);
    }

    public String toString() {
        return "Empregado: " + nome + "\nSalário: R$" + salarioLiquido();
    }
}
