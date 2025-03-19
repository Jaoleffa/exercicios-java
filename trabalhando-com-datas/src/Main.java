import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        //Operações básicas com instanciação e objetos de LocalDate/Instant
        /*
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

        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
        System.out.println(d11);

         */

        //Mais datas
        /*
        //Convertendo data pra texto
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //Criando novas variáveis de resultados utilizando horarios globais
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));



        DateTimeFormatter formatador1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM").withZone(ZoneId.systemDefault()); //pegando o fuso horario do sistema local
        DateTimeFormatter formatador4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatador5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(formatador1));
        System.out.println("d04 = " + formatador1.format(d04));
        System.out.println("d05 = " + d05.format(formatador2));
        System.out.println("d06 = " + formatador3.format(d06)); //O d06 só pode ser formatado pelo método format
        System.out.println(d05.format(formatador4)); //USANDO FORMATADORES PADRÕES PRONTOS
        System.out.println(formatador5.format(d06)); //USANDO FORMATADORES PADRÕES PRONTOS
        //Resultados de conversões de horarios globais para locais específicos
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);

        //Pegando partes específicas
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonth());
        System.out.println("d04 dia do ano = " + d04.getDayOfYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());

        //Convertendo data-hora global para local

        Pegando fuso horários
        for(String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }


        //Cálculos com data-hora
        LocalDate d04pastWeek = d04.minusWeeks(1);
        LocalDate d04pastDays = d04.minusDays(4);
        LocalDate d04futureWeek = d04.plusWeeks(1);
        System.out.println("D04 menos 1 semana = " + d04pastWeek);
        System.out.println("D04 menos 4 dias = " + d04pastDays);
        System.out.println("D04 mais 1 semana = " + d04futureWeek);

        LocalDateTime d05futureHour = d05.plusHours(5);
        System.out.println("D05 horas à frente: " + d05futureHour);
        LocalDateTime d05futureWeek = d05.plusWeeks(1);
        System.out.println("D05 horas à frente: " + d05futureHour);

        Instant d06Past = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("D06 1 semana atras: " + d06Past);

        Duration duracao = Duration.between(d05futureWeek, d05 );
        System.out.println(duracao.toDays());

        Duration duracao2 = Duration.between(d04pastWeek.atStartOfDay(), d04.atStartOfDay());
        System.out.println(duracao2.toDays());

        Duration duracao3 = Duration.between(d06Past, d06);
        System.out.println(duracao3.toDays());

         */

        //Trabalhando com dates
        /*
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("Z"));

        Date x1 = new Date(); //Criando data com horário atual
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("x1 = " + x1);
        System.out.println("x1 = " + sdf2.format(x1));
        System.out.println("x2 = " + x2);

        Date y1 = sdf1.parse("22/06/2018");
        System.out.println("Data y1 = " + y1);
        Date y2 = sdf2.parse("23/01/2002 05:43:23");
        System.out.println("Data y2 = " + y2);
        Date y3  = Date.from(Instant.parse("2018-06-25T15:42:02Z"));

        System.out.println("Data y1 = " + sdf1.format(y1));
        System.out.println("Data y2 = " + sdf2.format(y2));
        System.out.println("Data y3 = " + sdf2.format(y3));
        System.out.println("----------------------------------");
        System.out.println("Data y1 = " + sdf3.format(y1)); //Imprimindo no horário UTC
        System.out.println("Data y2 = " + sdf3.format(y2));
        System.out.println("Data y3 = " + sdf3.format(y3));
        System.out.println("----------------------------------");

         */

        //Manipulando data com Calendar
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(formato1.format(d));

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(d);
        calendario.add(Calendar.HOUR_OF_DAY, 4);
        d = calendario.getTime();

        int minutos = calendario.get(Calendar.MINUTE);
        System.out.println("Minutos = " + minutos);
        int meses = 1 + calendario.get(Calendar.MONTH);
        System.out.println("Meses = " + meses);

        System.out.println(d);

    }
}