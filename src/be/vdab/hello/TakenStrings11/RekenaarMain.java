package be.vdab.hello.TakenStrings11;

import java.util.Scanner;

public class RekenaarMain {
    public static void main(String[] args) {
        var rek = new Rekenaar("17 + 38 * 2 - 22");
        System.out.println(rek);
        System.out.println("Totaal: " + rek.getTotaal());

        //lege expressie
        rek.setTekst("");
        System.out.println(rek);
        System.out.println("Totaal: "+ rek.getTotaal());

        //andere expressie
        rek.setTekst("7 - 5 * 10 / 0 ");
        System.out.println(rek);
        System.out.println("Totaal: " + rek.getTotaal());


        //expressie laten ingeven door gebruiker

        var scanner = new Scanner(System.in);
        System.out.println("geef zelf een te berekenen expressie: ");
        var expressie = scanner.nextLine();
        rek.setTekst(expressie);
        System.out.println("Totaal :" + rek.getTotaal());
        System.out.println(rek);
    }
}
