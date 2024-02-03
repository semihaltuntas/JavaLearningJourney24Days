package be.vdab.hello.voorbelden14;

import java.util.Locale;
import java.util.Scanner;

public class SnoepAutomaat {
    public static void main(String[] args) {

        System.out.println("aankoop bedrag (bv: 0.42 of 1,02): ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double aankoopBedrag = scanner.nextDouble();

        double wisselGeld = 2.0 - aankoopBedrag;

        int euro1 = (int) wisselGeld;
        System.out.println("euro1 = " + euro1);
        int centen = (int) Math.round((wisselGeld - euro1) * 100);

        int euro50 = centen / 50;
        centen %= 50;
        int euro20 = centen / 20;
        centen %= 20;
        int euro10 = centen / 10;
        centen %= 10;
        int euro5 = centen / 5;
        centen %= 5;
        int euro2 = centen / 2;
        centen %= 2;
        int cent1 = centen;

        System.out.println("Munten van 1 euro: " + euro1);
        System.out.println("Munten van 0.50 euro: " + euro50);
        System.out.println("Munten van 0.20 euro: " + euro20);
        System.out.println("Munten van 0.10 euro: " + euro10);
        System.out.println("Munten van 0.05 euro: " + euro5);
        System.out.println("Munten van 0.02 euro: " + euro2);
        System.out.println("Munten van 0.01 euro: " + cent1);


    }
}