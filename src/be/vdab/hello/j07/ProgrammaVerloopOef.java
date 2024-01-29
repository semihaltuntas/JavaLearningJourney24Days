package be.vdab.hello.j07;

import java.util.Scanner;

public class ProgrammaVerloopOef {
    public static void main(String[] args) {

        //Blokken van statements en scope van variabelen
        var a = 5;
        {

            var b = 6;
            System.out.println("a is " + a);
            System.out.println("b is " + b);
        }
        System.out.println("a is " + a);
        // System.out.println("b is "+b);

        //De if-instructie
        var getal = 6;
        int getal2;
        if (getal % 2 == 0) {
            System.out.println("het getal " + getal + " is even.");
            getal2 = getal * 3;
            System.out.println(getal2);
        } else {
            System.out.println("het getal " + getal + " is oneven.");
        }
        //  De conditional operator ? : ternary
        var c = 15;
        var d = 6;
        var grootste = c < d ? d : c;
        System.out.println("Grootste getal: " + grootste);

        // switch case

        /*System.out.println("geef een keuze in van 1 tot 3");
        var scanner = new Scanner(System.in);
        var menuKeuze = scanner.nextInt();
        switch (menuKeuze) {
            case 1 : System.out.println("Keuze 1");break;
            case 2 : System.out.println("Keuze 2"); break;
            case 3 : System.out.println("Keuze 3");break;
            default:
                System.out.println("geen keuze 1 tot 3 gegeven");
        }*/
        System.out.println("tik een dag!!");
        var scanner = new Scanner(System.in);
        var dag = scanner.next();
        var isWeekend = switch (dag.toLowerCase()) {
            case "maandag","dinsdag","woensdag","donderdag","vrijdag" -> false;
            case "zaterdag","zondag" -> true;
            default -> throw new IllegalArgumentException(dag + "bestaat niet");
        };
        System.out.println(isWeekend ? dag + "is weekend" :dag +"is een werkdag");
    }
}
