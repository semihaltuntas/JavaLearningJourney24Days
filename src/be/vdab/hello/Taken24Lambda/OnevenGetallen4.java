package be.vdab.hello.Taken24Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnevenGetallen4 {
    public static void main(String[] args) {

        System.out.println("Tik een getal !");
        Scanner scanner = new Scanner(System.in);
        int getal = scanner.nextInt();

        List<Integer> nummers = new ArrayList<>();

        while (getal != 0) {
            nummers.add(getal);
            getal = scanner.nextInt();
        }
//        System.out.println(nummers);
        nummers.stream().filter(nummer -> nummer % 2 != 0).
                sorted((getal1,getal2)->getal1.compareTo(getal2)).
                forEach(onevenGetallen -> System.out.println(onevenGetallen));


    }
}
