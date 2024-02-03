package be.vdab.Main;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.verwarming.Stookketel;
import be.vdab.voertuigen.*;

import java.text.DecimalFormat;
import java.util.TreeSet;

public class MainProgrammaVoertuig {
    public static void main(String[] args) {
//        var opel1 = new Personenwagen();
//        opel1.toon();
//        System.out.println(opel1);
//
//        System.out.println("-------------------------");
//        Personenwagen opel2 = new Personenwagen("Semih Altuntas",
//                14599.0F, 105, 6.8F, "1-SMH-034", 5, 5);
//        opel2.toon();
//        System.out.println(opel2);
//
//        System.out.println("------------------");
//        opel2.setKostPrijs(-15000);
//        opel2.setKostPrijs(15000);
//        opel2.setAantalDeuren(-7);
//        opel2.setAantalDeuren(4);
//        opel2.setAantalPassagiers(4);
//        System.out.println(opel2);
//
//        System.out.println("---Volvo----");
//        Vrachtwagen volvo1 = new Vrachtwagen();
//        volvo1.toon();
//        System.out.println(volvo1);
//
//        Vrachtwagen volvo2 = new Vrachtwagen("Ayhan ALTUNTAS",
//                214599.0F, 440, 33.1F, "1-AYH-058", 6000.0F);
//        volvo2.toon();
//        System.out.println(volvo2);
//        System.out.println("------------");
//        System.out.println("Kyotoscore personenwagen 1: " + opel1.getKyotoScore());
//        System.out.println("Kyotoscore personenwagen 2: " + opel2.getKyotoScore());
//        System.out.println("Kyotoscore Vrachtwagen 1: " + volvo1.getKyotoScore());
//        System.out.println("Kyotoscore Vrachtwagen 2: " + volvo2.getKyotoScore());
//
//        //polymorfisme
//        System.out.println("-------------------");
//
//        Voertuig[] voertuigen = new Voertuig[4];
//        voertuigen[0] = opel1;
//        voertuigen[1] = opel2;
//        voertuigen[2] = volvo1;
//        voertuigen[3] = volvo2;
//
//        System.out.println("\n--- toString()---");
//        for (var voertuig : voertuigen) {
//            System.out.println(voertuig);
//        }
//        System.out.println("\n--- method toon() ----");
//        for (var voertuig : voertuigen) {
//            voertuig.toon();
//        }
//
//        var vervuiler = new Vervuiler[3];
//        vervuiler[0] = new Personenwagen("Semih Altuntas", 14599.0F, 105, 6.8F,
//                "1-SMH-034", 5, 5);
//        vervuiler[1] = new Vrachtwagen("Ayhan ALTUNTAS", 214599.0F, 440, 33.1F,
//                "1-AYH-058", 6000.0F);
//        vervuiler[2] = new Stookketel(15.0F);
//
//        System.out.println("Berekening Vervuiling van Personenwagen :" + vervuiler[0].berekenVervuiling());
//        System.out.println("Berekening Vervuiling van Vrachtwagen : " + vervuiler[1].berekenVervuiling());
//        System.out.println("Berekening Vervuiling van Stookketel :" + vervuiler[2].berekenVervuiling());
//
//
//        System.out.println("\n*** Array van PRİVATE geg van auto's ***");
//        var autos = new Privaat[4];
//        autos[0] = opel1;
//        autos[1] = opel2;
//        autos[2] = volvo1;
//        autos[3] = volvo2;
//
//        for (var auto : autos) {
//            auto.geefPrivateData();
//        }
//        System.out.println("\n*** Array van MİLİEU geg van auto's ***");
//
//        var autos1 = new Milieu[4];
//        autos1[0] = opel1;
//        autos1[1] = opel2;
//        autos1[2] = volvo1;
//        autos1[3] = volvo2;
//
//        for (var auto : autos1) {
//            auto.geefMilieuData();
//        }
        System.out.println("----- TreeSet ----");
        var setVoertuigen = new TreeSet<Voertuig>();
//        setVoertuigen.add(opel2);
        setVoertuigen.add(new Personenwagen("Semih ALTUNTAS", 18321.0F, 110, 7.1F, "1-OPQ-099", 5, 5));
//        setVoertuigen.add(volvo2);
        setVoertuigen.add(new Vrachtwagen("Ayhan Altuntas", 254612.0F, 450, 33.1F, "1-AZE-123", 6200.0F));
        setVoertuigen.add(new Vrachtwagen("Esra Altuntas", 234545.0F, 300, 43.1F, "1-BZE-123", 6200.0F));
        setVoertuigen.add(new Personenwagen("Zaliha Altuntas", 234545.0F, 300, 43.1F, "1-BZE-123",5,5));

        System.out.println("\n*** TreeSet van voertuigen ***");
        for (var eenVoertuig : setVoertuigen) {
            System.out.println("Result :" + eenVoertuig );
        }

    }


}
