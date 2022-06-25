package modulo04;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.stream.Stream;

public class AulaAPIDatas {
    public static void main(String[] args) {

        // --------------------- LocalDate -------------------
        LocalDate localDate = LocalDate.now();
        LocalDate localDateOf = LocalDate.of(2000, 02, 18);
        System.out.println("LocalDate: " + localDateOf);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        boolean leapYear = LocalDate.now().isLeapYear();
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());

        // --------------------- LocalDateTime -------------------
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime localDateTime1 = LocalDateTime.parse("2015-02-20T06:30:00");
        System.out.println("LocalDateTime: " + localDateTime);

        // --------------------- LocalTime ----------------------
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);


        // --------------------- ZonedDateTime -------------------
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset); //converter uma data/hora com o "deslocamento" de uma zona

        String converter = "2022-03-13T20:17:43.936594508Z[Europe/London]";
        ZonedDateTime asd = ZonedDateTime.parse("2022-03-13T20:17:43.936594508Z[Europe/London]");
        System.out.println("Parseando: " + asd);

        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("OffsetDateTime: " + offSetByTwo + " __ " + offset);

        OffsetTime offsetTime = OffsetTime.now();
        System.out.println("OffsetTime: " + offsetTime);


        // -------------------------------------------------------

        //O tipo Instant é uma ferramenta importante para converter a partir de Date ou Calendar.
//        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        Calendar calendar = Calendar.getInstance();
        LocalDateTime instantTest = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
        System.out.println("Instant test: " + instantTest);
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        //-----------------------------

        OffsetDateTime offsetDateTime = OffsetDateTime.now().withOffsetSameLocal(offset);
        System.out.println("ex7: " + offsetDateTime);

        String name = localDateOf.getDayOfWeek().name();

        System.out.println("Nome do dia da semana: " + name);

        long days= ChronoUnit.DAYS.between(localDateOf, LocalDate.now().plusDays(1));

        System.out.println(days);

        Stream<LocalDate> until =  localDateOf.datesUntil(LocalDate.now().plusDays(1));

        long days2 = until.count();
        System.out.println(days2);

        Stream<LocalDate> untilQuantosSabados = localDateOf.datesUntil(LocalDate.now().plusDays(1)).filter(dates -> dates.getDayOfWeek().equals(DayOfWeek.SATURDAY));

        long quantosSabados = untilQuantosSabados.count();

        System.out.println("qnts sabados: " + quantosSabados);

        var horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);
        var comecoAula = horaAtual.minusHours(3);
        System.out.println("comeco aula: " + comecoAula);

        //-----------------------------------------------------

        LocalDateTime dataHora = LocalDateTime.now();
        var horaSP = ZonedDateTime.of(dataHora, ZoneId.of("America/Sao_Paulo"));
        var horaPT = ZonedDateTime.of(dataHora, ZoneId.of("Europe/Lisbon"));
        var horaAC = ZonedDateTime.of(dataHora, ZoneId.of("Brazil/Acre")); //pega essa string na oracle
        System.out.println("Hora em SP " + horaSP);
        System.out.println("Hora em PT Lisboa " + horaPT);
        System.out.println("Hora em AC " + horaAC);
    }
}
