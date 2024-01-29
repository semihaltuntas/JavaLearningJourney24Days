package be.vdab.hello.j06;

import java.util.Arrays;

public class ArrayOef {
    public static void main(String[] args) {
        Coordinaat[] coordinaatDizi = new Coordinaat[5];

        // Diziyi nesnelerle doldur
        for (int i = 0; i < coordinaatDizi.length; i++) {
            coordinaatDizi[i] = new Coordinaat(i, i * 2, i*3);
        }

        // Dizideki nesneleri kullanarak bir şeyler yapabilirsin
        for (Coordinaat coordinaat : coordinaatDizi) {
            System.out.println("X: " + coordinaat.getX() + ", Y: " + coordinaat.getY()+ ", Z: " + coordinaat.getZ());
        }

        System.out.println("--- Impliciete initialisatie array ---");
        var getallen = new int[3];
        System.out.println("1e getal van de tabel = " + getallen[0]);
        System.out.println("2e getal van de tabel = " + getallen[1]);
        System.out.println("3e getal van de tabel = " + getallen[2]);

        var chars = new char[3];
        System.out.println("1e element van tabel = " + chars[0]);
        System.out.println("2e element van tabel = " + chars[1]);
        System.out.println("3e element van tabel = " + chars[2]);

        var vlaggen = new boolean[3];
        System.out.println("1e element van boolean tabel = " + vlaggen[0]);
        System.out.println("2e element van boolean tabel = " + vlaggen[1]);
        System.out.println("3e element van boolean tabel = " + vlaggen[2]);

        var kommaGetallen = new float[3];
        System.out.println("1e element uit float tabel:" + kommaGetallen[0]);
        System.out.println("2e element uit float tabel:" + kommaGetallen[1]);
        System.out.println("3e element uit float tabel:" + kommaGetallen[2]);
        System.out.println("");
        var namen = new String[3];
        System.out.println("1e element uit String tabel:" + namen[0]);
        System.out.println("2e element uit String tabel:" + namen[1]);
        System.out.println("3e element uit String tabel:" + namen[2]);
        System.out.println("");

     var lottogetallen = new byte[]{12, 15, 21, 23, 30, 40, 17};
     var lonen = new float[]{1250.63F, 1310.25F, 1546.88F};
     var voornamen = new String[]{"Lode", "Vie"};
//        for (byte num: lottogetallen){
//            System.out.println(num);
//            lottogetallen[2]= 19;
//            lottogetallen[3]= 29;
//        }
        System.out.println(Arrays.toString(lottogetallen));
        System.out.println(lottogetallen.length);


    }
}

