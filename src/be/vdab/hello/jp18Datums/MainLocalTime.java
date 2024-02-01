package be.vdab.hello.jp18Datums;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime.*;
import java.util.Scanner;

public class MainLocalTime {
    public static void main(String[] args) {
        // 19.2 LocalTime :

        var nu = LocalTime.now();
        var ietsLater = LocalTime.now();
        System.out.println(ietsLater.equals(nu));
        System.out.println(nu);

        System.out.println(nu.getHour());
        System.out.println(nu.getMinute());
        System.out.println(nu.getSecond());
        System.out.println(nu.getNano());

        System.out.println("----------");
        var straks = LocalTime.of(23, 59);
        System.out.println("Compare :" + nu.compareTo(straks));
        System.out.println("isBefore :" + nu.isBefore(straks));
        var minutenTusse = ChronoUnit.MINUTES.between(nu, straks);
        System.out.println("minuten Tussen : " + minutenTusse);


        var middag = LocalTime.of(12, 0);
        System.out.println("Middag :" + middag);

        var juistVoorMiddag = LocalTime.of(11, 59);
        System.out.println("Plus een minute : " + juistVoorMiddag.plusMinutes(1));

        var formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Formatter :" + middag.format(formatter));

        formatter = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println("formatter1 :" + middag.format(formatter));

        var formatter1 = DateTimeFormatter.ofPattern("H:m");
        var scanner = new Scanner(System.in);
        System.out.println("tijd (uren : minuten) :");
        var stringAlsTijd = scanner.next();
        var tijd = LocalTime.parse(stringAlsTijd, formatter1);
        System.out.println("tijd :" + tijd);


    }
}
