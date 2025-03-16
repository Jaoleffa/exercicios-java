import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        LocalDate primeiraData = LocalDate.now();
        System.out.println(primeiraData);
        LocalDateTime segundaData = LocalDateTime.now();
        System.out.println(segundaData);

        Instant dataFusoHorario = Instant.now();
        System.out.println(dataFusoHorario);

        LocalDate d04 = LocalDate.parse("2022-07-16");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-16T14:00");
        System.out.println(d05);

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println(d06);

        Instant d07 = Instant.parse("2022-07-20T01:30:26-04:00");
        System.out.println(d07);

        LocalDate d08 = LocalDate.parse("20/07/2022",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //ou
        //LocalDate d08 = LocalDate.parse("20/07/2022",DateTimeFormatter.ofPattern(fmt1)); //com objeto instanciado la em cima
        System.out.println(d08);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(d09);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println(d10);

    }
}