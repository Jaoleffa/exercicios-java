import models.services.BrazilInterestService;
import models.services.InterestService;
import models.services.UsaInterestService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor: ");
        double amount = sc.nextDouble();
        System.out.println("Digite a quantia de meses");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));

    }
}