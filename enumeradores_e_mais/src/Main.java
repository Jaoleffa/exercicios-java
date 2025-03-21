import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Entre os dados do trabalhador: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Entre o level do trabalhador: ");
        String level = sc.nextLine();
        System.out.println("Digite o salário base do trabalhador: ");
        double workerSalario = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), workerSalario, new Department(departamento));

        System.out.println("Quantos contratos esse trabalhador terá: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o dado do contrato Nº" + (i + 1));
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Entre com o mês e ano para calcular o salário: (MM/YYYY) ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }

}