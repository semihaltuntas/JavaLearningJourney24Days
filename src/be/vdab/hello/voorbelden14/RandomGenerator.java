package be.vdab.hello.voorbelden14;

import java.util.Arrays;

public class RandomGenerator {
    public static void main(String[] args) {

        int[] getallen = new int[100];

        for (int i = 0; i < 10000; i++) {
            var randomGetal = (int) (Math.random() * 100) + 1;
            //System.out.println(randomGetal);
            getallen[randomGetal-1]++;
        }

        for (int i = 0; i < getallen.length; i++) {
            System.out.println("getal " + (i + 1) + " : " + getallen[i]);
        }
        System.out.println(Arrays.toString(getallen));
    }
}
