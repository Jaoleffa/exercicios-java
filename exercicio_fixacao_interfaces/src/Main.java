import models.entities.Contract;
import models.entities.Installment;
import models.services.ContractService;
import models.services.PaypalPaymenteService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Digite o valor do contrato: ");
        double valorTotal = sc.nextDouble();
        Contract contrato = new Contract(number, date, valorTotal);

        System.out.println("Entre o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalPaymenteService());
        contractService.processContracts(contrato,n);

        System.out.println("Parcelas: ");
        for(Installment parcela : contrato.getParcelas()) {
            System.out.println(parcela);
        }

    }
}