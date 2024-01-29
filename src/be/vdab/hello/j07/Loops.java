package be.vdab.hello.j07;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        //WHİLE LOOP
        var teller = 10;
        while (teller > 1){
            System.out.println(teller);
            teller--;
        }
        //DO-WHİLE LOOP
        System.out.println("----");
        var teller1 = 15;
        do {
            System.out.println(teller1);
            teller1++;
        }while (teller1<=10);
        System.out.println("-----");

        //FOR LOOP
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("----");

        //FOR EACH LOOP
        var getallen = new int[5];
        for (int i = 0; i <=4 ; i++) {
            getallen[i] = i+20;
        }
        System.out.println(Arrays.toString(getallen));

        for (int getal1:getallen) {
            System.out.println(getal1);

        }

    }
}
