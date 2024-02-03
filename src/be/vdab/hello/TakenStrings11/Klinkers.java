package be.vdab.hello.TakenStrings11;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        System.out.println("Geef een zin aub! ");
        Scanner scanner = new Scanner(System.in);
        var text = scanner.nextLine().toLowerCase();

        int aantalKlinkers=0;
        String klinkers = "aeiou";
        for (int i = 0; i < text.length() ; i++) {
            var character = text.charAt(i);
            if (klinkers.contains(String.valueOf(character))){
                aantalKlinkers++;
            }
//            if ("aeiou".indexOf(character)>-1){
//                aantalKlinkers++;
//            }
        }
        System.out.println("Aantal Klinkers : "+ aantalKlinkers);





    }
}
