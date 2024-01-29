package be.vdab.hello.j06;

import java.util.Arrays;

public class ArrayOef1 {
    public static void main(String[] args) {

        //* Twee Dimensional Arrays

        int[][] matris = new int[3][4];
        matris[0][0] = 10;
        matris[1][2] = 30;
        matris[2][3] = 50;

        for (int[] satır : matris) {
            System.out.println(Arrays.toString(satır));
        }
        System.out.println("..................");

        var temperaturen = new float[10][5];
        temperaturen[0][0] = 18.25F;
        temperaturen[5][3] = 22.45F;
        for (int i = 0; i < temperaturen.length; i++) {
            System.out.println(Arrays.toString(temperaturen[i]));
        }

        System.out.println("----------------");

        var getallen = new int [4][];
        getallen[0] = new int[5];
        getallen[0][3]= 30;
        getallen[1] = new int[7];
        getallen[1][5] =20;
        getallen[2] = new int[3];
        getallen[2][2]=40;
        getallen[3] = new int[4];
        getallen[3][3]= 50;

        for(int[] satır1 : getallen){
            System.out.println(Arrays.toString(satır1));
        }
    }
}
