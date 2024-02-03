package be.vdab.WinkelDENEME;


public class MainWinkel {
    public static void main(String[] args) {

        Catalogus catalogus = new Catalogus();
        Mandje mandje = new Mandje();

        var teller = 1;
        for (var product : catalogus.getProducten()) {
            if (teller % 2 == 0) {
                mandje.add(product,teller);
            }
            teller++;
        }

        System.out.println("uw kocht");
        for (var entry : mandje.getMandje().entrySet()){
            System.out.println(entry.getKey() +" : " + entry.getValue());
        }
        System.out.println("-----");
        System.out.println("TotalePrijs uw gekocht : "+ mandje.totalePrijs());





    }
}
