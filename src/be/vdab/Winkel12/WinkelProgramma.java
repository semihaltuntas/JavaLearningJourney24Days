package be.vdab.Winkel12;

public class WinkelProgramma {
    public static void main(String[] args) {

        var catalogus = new Catalogus();
        var mandje = new Mandje();

        var teller = 1;
        for (var product : catalogus.getProducten()) {
            if (teller % 2 == 0) {
                mandje.add(product, teller);
            }
            teller++;
        }


        System.out.println("U kocht :");
        for (var entry : mandje.getMaandje().entrySet()) {
            System.out.println(entry.getKey() + "; aantal stuks: " +
                    entry.getValue());
        }
        System.out.println();
        System.out.println("U kocht voor een totaal van: "+
                mandje.getTotalePrijs());
    }

}
