import entities.OutsourcedEmployee;
import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos empregados quer registrar:");
        int n = sc.nextInt();
        List<Employee> empregados = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Empregado Número " + (i + 1));
            System.out.println("Ele é terceirizado? (y/n)");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite a quantidade de horas: ");
            Integer horas = sc.nextInt();
            System.out.println("Digite o valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            if(escolha == 'y') {
                System.out.println("Digite o valor do pagamento adicional: ");
                Double valorAdicional = sc.nextDouble();
                Employee empregado = new OutsourcedEmployee(nome, horas, valorPorHora, valorAdicional);
                empregados.add(empregado);
            } else {
                Employee empregado = new Employee(nome, horas, valorPorHora);
                empregados.add(empregado);
            }

        }

        System.out.println("Payments:");
        for(Employee emp : empregados) {
            System.out.println(emp);
        }



        sc.close();
    }
}