import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.print("Room number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.println("Data do Check-in: (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.nextLine());
            System.out.println("Data do Check-out: (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.nextLine());
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Data do Check-in: (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.nextLine());
            System.out.println("Data do Check-out: (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.nextLine());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch(RuntimeException e) {
            System.out.println("Unexpected error");
        }




    }

}