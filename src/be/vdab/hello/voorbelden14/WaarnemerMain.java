package be.vdab.hello.voorbelden14;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {
        var thermometer = new Waarnemer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("geef een temperatuur in (stop = 999):");
        var temperatuur = scanner.nextInt();

        while (temperatuur != 999) {
            thermometer.registeer(temperatuur);
            System.out.println("Geef een temperatuur in: ");
            temperatuur = scanner.nextInt();
        }

        System.out.println("Het aantal waarmingen is: " + thermometer.getAantalWaarnemingen());
        System.out.println("de hoogste temperatuur is: " + thermometer.getMaxTemp());
        System.out.println("de laagste temperatuur is: " + thermometer.getMinTemp());
        System.out.println("de gemiddelde temperatuur is: " + thermometer.getGemTemp());

    }
}
