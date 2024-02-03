package be.vdab.hello.TakenStrings11;

import java.util.Scanner;

public class PalindroomMain {
    public static void main(String[] args) {
        System.out.println("Tik een woord of zin aub...!");
        Scanner scanner = new Scanner(System.in);
        var woord = scanner.nextLine();
        Palindroom palin = new Palindroom(woord);
        System.out.println("Dat is originaal tekst :" + palin.orgTekst);
        System.out.println("Dat is reverse tekst : "+ palin.revTekst);


        if (palin.isPalindroom()){
            System.out.println("Dat is helemaal Palindroom :"+ woord);
        }else {
            System.out.println("Dat is geen Palindroom :" + woord);
        }

    }
}


