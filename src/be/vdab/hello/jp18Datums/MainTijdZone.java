package be.vdab.hello.jp18Datums;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class MainTijdZone {
    public static void main(String[] args) {

//        Set<String> allzones = ZoneId.getAvailableZoneIds();
//        for (String zone :allzones){
//            System.out.println(zone);
//        }
        var brussel = ZoneId.of("Europe/Brussels");
        System.out.println("Brussel :" + brussel);
        var losAngeles = ZoneId.of("America/Los_Angeles");
        System.out.println("Los Angeles :" + losAngeles);
        var standaard = ZoneId.systemDefault();
        System.out.println("Standaard : " + standaard);

        var datumEnTijdBrussel = ZonedDateTime.now(brussel);
        System.out.println("datumEnTijdBrussel = " + datumEnTijdBrussel);

        var datumEnTijdLosAngeles = ZonedDateTime.now(losAngeles);
        System.out.println("datumEnTijdLosAngeles = " + datumEnTijdLosAngeles);

        var tijdzone = ZoneOffset.ofHours(3);
        System.out.println("tijdzone = " + tijdzone);
        var datumEnTijdVanDrieUur = ZonedDateTime.now(tijdzone);
        System.out.println("datumEnTijdVanDrieUur = " + datumEnTijdVanDrieUur);


    }
}
