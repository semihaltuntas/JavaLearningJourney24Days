package be.vdab.hello.Taken22GemiddeldeRekenaar;

import java.math.BigDecimal;

public class GemiddeldeRekenaar implements Runnable {
    private final double[] getallen;
    private final int vanafIndex;
    private final int totIndex;
    private double gemiddelde;


    public GemiddeldeRekenaar(double[] getallen, int vanafIndex, int totIndex) {
        this.getallen = getallen;
        this.vanafIndex = vanafIndex;
        this.totIndex = totIndex;
    }

    @Override
    public void run() {
        double totaal = 0;
        for (var i = vanafIndex; i < totIndex; i++) {
            // System.out.println(getallen[i]);
            totaal += getallen[i];
        }
        // System.out.println(totaal);
        gemiddelde = totaal / (totIndex - vanafIndex);
    }

    public double getGemiddelde() {
        return gemiddelde;
    }
}
