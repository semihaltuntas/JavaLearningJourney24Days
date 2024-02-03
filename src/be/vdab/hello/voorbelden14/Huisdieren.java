package be.vdab.hello.voorbelden14;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {

        System.out.println("hoeveel huisdieren heb jıj?");
        Scanner scanner =new Scanner(System.in);
        int aantalhuisdieren= scanner.nextInt();

        switch (aantalhuisdieren){
            case 0 -> System.out.println("geen huisdieren??");
            case 1-> System.out.println("1 huisdier. Gezellig!");
            case 2 -> System.out.println("2 huisdieren, Leuk!");
            case 3 -> System.out.println("3 huisdieren, Prima!");
            default -> System.out.println("zoveel dieren zoals een farm :D:D");

        }
    }
}
