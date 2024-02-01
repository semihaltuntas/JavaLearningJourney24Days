package be.vdab.hello.jp16BigDecimal;

import java.math.RoundingMode;

public class BigDecimal {
    public static void main(String[] args) {
        float totaalF = 0.0F;
        for (var i = 0; i < 1000; i++) {
            totaalF += 0.01F;
        }
        double totaalD = 0.0;
        for (int i = 0; i < 1000; i++) {
            totaalD += 0.01;
        }

        System.out.println("som met floats :" + totaalF + "\nsom met doubles :" + totaalD);
        var geluksGetal = java.math.BigDecimal.valueOf(7);
        var grootGetal = java.math.BigDecimal.valueOf(7123459L);
        var increment = java.math.BigDecimal.valueOf(0.01);

        var piString = "3.141592653";
        var pi = new java.math.BigDecimal(piString);
        System.out.println(pi);

//        BigDecimal.ZERO; // İs de waarde 0
//        BigDecimal.ONE;  // is de waarde 1
//        BigDecimal.TEN;  // is de waarde 10

        var eenBigDecimal = java.math.BigDecimal.valueOf(2.362);
        eenBigDecimal = eenBigDecimal.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("eenBigDecimal = " + eenBigDecimal);

        var totaalBD = java.math.BigDecimal.ZERO;
        var incremBD = java.math.BigDecimal.valueOf(0.01);

        for (int i = 0; i < 1000; i++) {
            totaalBD = totaalBD.add(incremBD);
        }
        System.out.println("totaalBD = " + totaalBD);


    }
}
