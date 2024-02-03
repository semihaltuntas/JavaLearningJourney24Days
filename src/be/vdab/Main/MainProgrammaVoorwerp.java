package be.vdab.Main;

import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.LeesBoek;
import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Woordenboek;
import be.vdab.util.Isbn13Exception;

public class MainProgrammaVoorwerp {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[3];

        try {
            voorwerpen[0] = new LeesBoek();
        } catch (Isbn13Exception ex) {
            System.out.println("0 :" + ex.getMessage());
        }

        try {
            voorwerpen[1] = new LeesBoek("978-0-306-40615-7", "Studieboek Java 7", "Oracle", 20.4F,
                    "Genre Informatica", "onderw programmeren");
        } catch (Isbn13Exception ex) {
            System.out.println("1 :" + ex.getMessage());
        }
        try {
            voorwerpen[2] = new Woordenboek("978-90-664-8143-9",
                    "Woordenboek Engels", "Van Dale", 30.10F,
                    "genre vertaal woordenboek", "taal Engels-Nederlands");

        } catch (Isbn13Exception ex) {
            System.out.println("2 :"+ex.getMessage());
        }

        var totaleWinst = 0;
        for (var eenVoorwerp : voorwerpen) {
            System.out.println(eenVoorwerp);
            if (eenVoorwerp != null) {
                eenVoorwerp.gegevensTonen();
                System.out.println("-----");
                totaleWinst += eenVoorwerp.winstBerekenen();
            }

        }
        System.out.println("DE TOTALE WİNST BEDRAAGT :"+ totaleWinst);
    }

}

//        var boekenrek = new Boekenrek[4];
//
//        Voorwerp[] voorwerpen = {
//                new Boekenrek(),
//                new Boekenrek(75, 90, 28.5F),
//                new LeesBoek(),
//                new LeesBoek("Leesboek Java 7", "Oracle", 20.4F,
//                        "genre Informatica", "onderw programmeren"),
//                new Woordenboek(),
//                new Woordenboek("Woordenboek Engels", "Van Dale", 30.10F,
//                        "genre vertaal woordenboek", "taal Engels-Nederlands")
//        };
//        var totalewinst = 0.0F;
//
//
//        for (int i = 0; i < voorwerpen.length ; i++) {
//            voorwerpen[i].gegevensTonen();
//            System.out.println("-----//-----");
//            totalewinst += voorwerpen[i].winstBerekenen();
//        }
////        for (var voorwerp : voorwerpen) {
////            voorwerp.gegevensTonen();
////            System.out.println("---------");
////            totalewinst += voorwerp.winstBerekenen();
////        }
//        System.out.println("DE TOTALE WİNST BEDRAAGTTT  = " + totalewinst);
//    }


