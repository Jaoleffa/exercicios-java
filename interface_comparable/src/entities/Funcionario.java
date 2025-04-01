package entities;

public class Funcionario implements Comparable<Funcionario>{
    protected String name;
    protected double salario;

    public Funcionario() {

    }

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario o) {
        return name.compareTo(o.getName());
    }
}
