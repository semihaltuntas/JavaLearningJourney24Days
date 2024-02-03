package be.vdab.hello.voorbelden14;

import java.util.Arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {

        int [] getallen = new int[100];

        for (int i = 0; i < getallen.length ; i++) {
            getallen[i] = (int) (Math.random()*1000+1);
        }
        Arrays.sort(getallen);
        for (int getal:getallen) {
            System.out.println(getal +" ");
        }
//tweede oplossing

//        for (int pos = 0; pos <getallen.length-1; pos++) {
//            for (int i = pos+1; i <getallen.length ; i++) {
//                if (getallen[pos] > getallen[i]) {
//                    var tempGetal = getallen[pos];
//                    getallen[pos] = getallen[i];
//                    getallen[i] = tempGetal;
//                }
//
//            }
//            for (int j : getallen){
//                System.out.println(j+ "/t");
//            }
//        }

    }
}
