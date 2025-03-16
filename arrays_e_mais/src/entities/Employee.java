package entities;

public class Employee {
    private int id;
    private String name;

    public Employee (Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void increaseSalario(double porcentagem) {
        salary = this.salary * (1 + porcentagem / 100);
    }

    private double salary;

    public String toString() {
        return id + ", " + name + ", " + "R$" + String.format("%.2f ", salary);
    }
}
