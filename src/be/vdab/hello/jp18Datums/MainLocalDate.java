package be.vdab.hello.jp18Datums;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class MainLocalDate {
    public static void main(String[] args) {

        //LocalDate opvragen :
        System.out.println("------Date Time-------");
        var vandaag = LocalDate.now();
        var heden = LocalDate.now();
        System.out.println("Vandaag : " + vandaag);
        System.out.println("İs equal ?: " + vandaag.isEqual(heden));

        var beginEuro = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println("beginEuro = " + beginEuro);
        System.out.println("Compareto : " + beginEuro.compareTo(heden));
        System.out.println("isAfter : " + heden.isAfter(beginEuro));
        var dagenTussen = ChronoUnit.DAYS.between(beginEuro, heden);
        System.out.println("dagenTussen = " + dagenTussen);
        var jarenTussen = ChronoUnit.YEARS.between(beginEuro, heden);
        System.out.println("jarenTussen = " + jarenTussen);

        var period = Period.between(beginEuro, vandaag);
        System.out.println("De euro is " + period.getYears() + " jaar, " + period.getMonths() + " maand en " +
                period.getDays() + " dagen geleden ingevoerd.");

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("DateTimeFormatter :" + beginEuro.format(formatter));

        formatter = DateTimeFormatter.ofPattern("E d MMMM yyyy");
        System.out.println("Formatter 2 : " + beginEuro.format(formatter));

        System.out.println("---------------");


        var eindeBelgischeFrank = LocalDate.of(2001, Month.DECEMBER, 31);
        var beginVanEuro = eindeBelgischeFrank.plusDays(1);
        System.out.println(beginVanEuro);
        System.out.println(beginVanEuro.plusMonths(1));
        System.out.println(beginVanEuro.minusDays(1));
        var adjuster = TemporalAdjusters.next(DayOfWeek.FRIDAY);
        var volgendeWoensdag = vandaag.with(adjuster);
        System.out.println("Volgende woensdag :" + volgendeWoensdag);

        System.out.println("-----------------");


        System.out.println("eindeBelgischeFrank = " + eindeBelgischeFrank);
        System.out.println(eindeBelgischeFrank.getDayOfMonth());
        System.out.println(eindeBelgischeFrank.getDayOfWeek());
        System.out.println(eindeBelgischeFrank.getDayOfYear());
        System.out.println(eindeBelgischeFrank.getMonthValue());
        System.out.println(eindeBelgischeFrank.getMonth());
        System.out.println(eindeBelgischeFrank.lengthOfMonth());
        System.out.println(eindeBelgischeFrank.getYear());
        System.out.println(eindeBelgischeFrank.isLeapYear());
        var birthdayOfSemih = LocalDate.of(1990, 05, 05);
        System.out.println("birthdayOfSemih  = " + birthdayOfSemih.getDayOfWeek());

        var formatter2 = DateTimeFormatter.ofPattern("d/M/yyyy");
        var scanner = new Scanner(System.in);
        System.out.println("datum (dag/maand/jaar) :");
        var datumAlsString = scanner.nextLine();
        var datum = LocalDate.parse(datumAlsString, formatter2);
        System.out.println("datum van Gebruiker :" + datum);

    }
}
