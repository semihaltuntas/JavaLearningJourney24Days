package be.vdab.hello.voorbelden14;

import java.util.Locale;
import java.util.Scanner;

public class BankrekeningNummer {
    public static void main(String[] args) {

        System.out.println("schrijf een bankrekening Nummer! ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        long rekeningNummer = scanner.nextLong();

        long deelTaal = rekeningNummer / 100;
        double rest = deelTaal % 97;
       // System.out.println(rest);
        var laatste2Nummer = rekeningNummer % 100;
        //System.out.println(laatste2Nummer);

        if (laatste2Nummer == rest) {
            System.out.println("correcte rekening nummers:" + rekeningNummer);
        } else {
            System.out.println("foutive rekening nummers:" + rekeningNummer);
        }
    }
}
