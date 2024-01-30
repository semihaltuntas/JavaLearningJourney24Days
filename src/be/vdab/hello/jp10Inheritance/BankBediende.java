package be.vdab.hello.jp10Inheritance;

import javax.swing.*;
import java.util.Objects;

public class BankBediende {
    public static void main(String[] args) {

        System.out.println("Intrestpercentage van de spaarrekening: "
                + Spaarrekening.getIntrest());


        Rekening spaar = new Spaarrekening("BE12 3456 789", 1.5, 0.0);
        System.out.println(spaar.getSaldo());
        Zichtrekening zicht = new Zichtrekening("BE98 7654 3210", 1000);
        Rekening spaar1 = new Spaarrekening("BE12 3456 789", 1.5, 0.0);
        Rekening spaar2 = new Spaarrekening("BE12 3456 789", 1.5, 0.0);


        System.out.println("equals() het vergelijk hashcodes van 2 objecten :"+spaar1.equals(spaar2) +" : "+ Objects.equals(spaar1,spaar2));
        System.out.println( spaar1.hashCode() == spaar2.hashCode());



        System.out.println("Intrestpercentage van de spaarrekening: "
                + Spaarrekening.getIntrest());


        System.out.println("MaxKrediet van de zichtrekening is: "
                + zicht.getMaxKrediet());


        spaar.storten(600.0);
        zicht.storten(200.0);

        spaar.afhalen(25.0);
        System.out.println("Saldo van de spaarrekening: "
                + spaar.getSaldo());

        zicht.afhalen(50.0);
        System.out.println("Saldo van de zichtrekening: "
                + zicht.getSaldo());

        zicht.afhalen(2000);
        System.out.println("Saldo van de zichtrekening (na poging )"
                + "afhalen 2000) : " + zicht.getSaldo());

        spaar.afhalen(600.0);
        System.out.println("Saldo van de spaarrekening (na poging )"
                + "afhalen 600) : " + spaar.getSaldo());


        zicht.afhalen(1100);
        System.out.println("Saldo van de zichtrekening (na poging "
                + "afhalen 1100) : " + zicht.getSaldo());

        zicht.setMaxKrediet(2000);
        System.out.println("MaxKrediet van de zichtrekening is(2000)=: "
                + zicht.getMaxKrediet());
        zicht.afhalen(900);
        System.out.println("Saldo van de zichtrekening (na poging " + "afhalen 900): "
                + zicht.getSaldo());

        System.out.println("Met toString method....");
        System.out.println(spaar);
        System.out.println(zicht);

        System.out.println("Met Abstract class en methods...");
        System.out.println("Intrest op de spaarrekening: " +
                spaar.berekenIntrest());
        System.out.println("Intrest op de zichtrekening: " +
                zicht.berekenIntrest());

        //toepassing polymorfisme
        System.out.println("POLYMORPHSM");
        var rekeningen = new Rekening[4];
        rekeningen[0] = new Spaarrekening("BE11 2233 4556 5634", 1.5);
        rekeningen[1] = new Spaarrekening("BE99 9944 4445 6665", 1.5);
        rekeningen[2] = new Zichtrekening("BE19 2356 6754 2345", 2000);
        rekeningen[3] = new Zichtrekening("BE91 9367 6754 2656", 1500);

        rekeningen[0].storten(500.0);
        rekeningen[1].storten(550.0);
        rekeningen[1].afhalen(120.0);
        rekeningen[2].storten(200.0);
        rekeningen[2].afhalen(20.0);
        rekeningen[3].storten(300.0);


        //Eerste 1. weg!

//        var i = 0;
//        while (i < rekeningen.length && rekeningen[i] != null) {
//            System.out.println("Saldo van de rekening: " +
//                    rekeningen[i].getSaldo());
//            i++;
//        }

        //Tweede 2. weg!

//        for (int i = 0; i < rekeningen.length; i++){
//            if (rekeningen[i] != null){
//                System.out.println("Saldo van de rekening: "+
//                        rekeningen[i].getSaldo());
//            }
//        }
          //Derde 3. weg!

        for (var rekening : rekeningen) {
            if (rekening != null) {
                System.out.println("Saldo van de rekening: " +
                        rekening.getSaldo());
            }
        }

        var spaarrek1 = (Spaarrekening) rekeningen[1];
        System.out.println(spaarrek1);

        Spaarrekening spaarrek = null;

        if (rekeningen[0] instanceof Spaarrekening){
            spaarrek = (Spaarrekening) rekeningen[0];
        }
//        if (rekeningen[0] instanceof Spaarrekening spaarrek){
//            System.out.println(spaarrek);
//        }
        System.out.println(rekeningen[0].equals(spaarrek1));
    }
}
