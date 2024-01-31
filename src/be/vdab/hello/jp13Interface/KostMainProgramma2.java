package be.vdab.hello.jp13Interface;

public class KostMainProgramma2 {
    public static void main(String[] args) {

        var kosten = new Kost[4];

        kosten[0] = new Werknemer("Semih", 2000.0);
        kosten[1] = new Werknemer("Esra", 2500.0);
        kosten[2] = new Vrachtwagen("Daf", 0.35, 25000, 150000.0, 8);
        kosten[3] = new Kopieermachine("Konica", 0.02, 9000);

        var personeelsKosten = 0.0;
        var andereKosten = 0.0;

        for (var eenKost : kosten) {
            if (eenKost.personeelsKost()) {
                personeelsKosten += eenKost.bedragKost();
            } else {
                andereKosten += eenKost.bedragKost();
            }
        }
        System.out.println("Personeelskosten : " + personeelsKosten);
        System.out.println("Andere kosten :" + andereKosten);
    }
}
