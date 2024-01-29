package be.vdab.hello.j07;

import java.util.Scanner;

public class Examens {
    public static void main(String[] args) {
        var wiskunde = geefPunten("wiskunde");
        var informatica = geefPunten("informatica");
        var boekhouden = geefPunten("boekhouden");

        var boekhoudenEnInformatica = boekhouden + informatica;

        if (wiskunde >= 6 || boekhoudenEnInformatica >= 12) {
            System.out.println("Student is geslaagd");
        } else if (wiskunde < 6) {
            System.out.println("Student is niet geslaagd voor Wiskunde");
        }
        if (boekhoudenEnInformatica < 12) {
            System.out.println("Student is niet geslaagd voor " + "boekhouden en informatica");
        }
    }

    private static int geefPunten(String vak) {
        System.out.println("Geef de punten voor " + vak + " (op)");
        Scanner scanner = new Scanner(System.in);
        var punten = scanner.nextInt();
        while (punten < 0 || punten > 10) {
            System.out.println("punten gaan op 10," + " dus gelieve een cijfer tussen 0-10 in te geven aub");
            punten = scanner.nextInt();
        }
        return punten;
    }
}
