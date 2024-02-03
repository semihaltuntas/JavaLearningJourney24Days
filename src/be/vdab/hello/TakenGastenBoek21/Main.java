package be.vdab.hello.TakenGastenBoek21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var manager = new GastenboekManager();
        var gastenboek = manager.leesGastenboek();

        var scanner = new Scanner(System.in);
        System.out.println("T=TONEN, S=SCHRİJVEN, E=EİNDE :");
        var keuze = scanner.nextLine();
        while (!keuze.equalsIgnoreCase("E")) {

            switch (keuze.toUpperCase()) {
                case "T":
                    System.out.println(gastenboek);break;
                case "S":

                    System.out.println("Schijver :");
                    var schrijver = scanner.nextLine();
                    System.out.println("Boodschap :");
                    var boodschap = scanner.nextLine();
                    gastenboek.toevoegen(new GastenboekEntry(schrijver, boodschap));
                    manager.schrijfGastenboek(gastenboek);
                    break;
                case "E":
                    System.out.println("Programma stopt!");
                    break;
                default:
                    System.out.println("Verkeerde Keuze");break;
            }
            System.out.println("T=TONEN, S=SCHRİJVEN, E=EİNDE :");
            keuze = scanner.nextLine();
            System.out.println(keuze);


        }


    }
}
