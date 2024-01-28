package be.vdab.hello.j05;

import java.util.Scanner;

public class Invoer {
    public static void main(String[] args) {
//        System.out.println("geef een getal: ");
//        Scanner scanner = new Scanner(System.in);
//        int getal = scanner.nextInt();,


//        System.out.println("Geef een getal: ");
//        var scanner = new Scanner(System.in);
//        var getal = scanner.nextInt();



        System.out.println("geef een getal:");
        Scanner scanner = new Scanner(System.in);
        int getal = scanner.nextInt();
        String text = scanner.nextLine();

        System.out.println("getal :" + getal);
        System.out.println("text = " + text);

    }
}
