package be.vdab.hello.jp22Thread;

import java.util.Scanner;

public class MainInsecten {
    public static void main(String[] args) {

        var klok = new Klok();
        var thread = new Thread(klok);
        thread.setDaemon(true);
        thread.start();

        System.out.println("------");
        var lezer1 = new InsectenLezer("/data/insecten1.csv", System.out);
        var thread1 = new Thread(lezer1);

        InsectenLezer lezer2 = new InsectenLezer("/data/insecten2.csv", System.err);
        var thread2 = new Thread(lezer2);

        thread1.start();
        thread2.start();


        var scanner = new Scanner(System.in);
        scanner.nextLine();// deze method wacht tot de gebruiker Enter drukt
//        thread.interrupt();// er wordt dan een InterruptedException gethrowed

        System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");

    }
}


//        System.setErr(new PrintStream("/data/fouten.txt"));
//        System.setOut(new PrintStream("/data/output.txt"));
//        System.err.println("Deze error komt in de file fouten.txt terecht");
//        System.out.println("semih");
//
//        System.err.println("Deze error komt in de file fouten.txt terecht");


