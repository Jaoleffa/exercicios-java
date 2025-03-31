import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Interfaces
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel: ");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada: (dd/MM/yyyy HH:mm)");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Retorno: (dd/MM/yyyy HH:mm)");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.println("Pagamento básico: R$" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: R$" + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: R$" + String.format("%.2f", cr.getInvoice().getTotalPayment()));



        sc.close();
    }
}