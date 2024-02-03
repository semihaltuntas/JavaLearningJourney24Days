package be.vdab.hello.voorbelden5;

import java.util.Arrays;

public class ArrayVan5Integers {
    public static void main(String[] args) {

        int[] getallenArray = new int[5];

        for (int i = 0; i < getallenArray.length; i++) {
            getallenArray[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(getallenArray));
        var som = 0;
        for (int getal : getallenArray) {
            som += getal;
        }
        System.out.println("Som van de Random getallen: " + som);
        var gemiddelde = (double) som / getallenArray.length;
        System.out.println("Gemiddelde van de Random getallen: " + gemiddelde);
    }
}







