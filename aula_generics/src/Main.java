import services.PrintService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantos valores? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor #" + (1 + i) + ": ");
            String value = sc.nextLine();
            ps.addValue(value);
        }

        System.out.println("\nOs valores são: ");
        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);
    }
}