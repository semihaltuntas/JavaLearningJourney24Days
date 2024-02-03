package be.vdab.hello.TakenDateEnTimeGeboorte19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Geboorte {
    public static void main(String[] args) {
        LocalDate nu = LocalDate.now();
        System.out.println("Tik geboorte Datum : d/M/yyyy ");
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        var scanner = new Scanner(System.in);
        var geboorteDatum = scanner.next();

        try {
            var geboorteAlsString = LocalDate.parse(geboorteDatum, formatter);
            var jarenTussenNu = ChronoUnit.YEARS.between(geboorteAlsString, nu);
            System.out.println("Geboorte Dag van De gebruiker :" + geboorteAlsString.getDayOfWeek()
                    + "\n" + "De gebruiker leeftijd :" + jarenTussenNu);
        } catch (Exception ex) {
            System.out.println("İnvalid datum! Please write as  d/M/yyyy !!!");
        }
    }
}
