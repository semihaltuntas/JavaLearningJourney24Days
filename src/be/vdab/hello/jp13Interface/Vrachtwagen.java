package be.vdab.hello.jp13Interface;

public class Vrachtwagen implements Kost, Afschrijving {

    private final String merk;
    private final double kostPerKm;
    private final int aantalKm;
    private final double aankoopPrijs;
    private final int voorzieneLevensduur;


    public Vrachtwagen(String merk, double kostPerKm, int aantalKm,
                       double aankoopPrijs, int voorzieneLevensduur) {
        this.merk = merk;
        this.kostPerKm = kostPerKm;
        this.aantalKm = aantalKm;
        this.aankoopPrijs = aankoopPrijs;
        this.voorzieneLevensduur = voorzieneLevensduur;
    }

    public String getMerk() {
        return merk;
    }

    public int getAantalKm() {
        return aantalKm;
    }

    @Override
    public int termijn() {
        return voorzieneLevensduur;
    }

    @Override
    public double jaarlijksBedrag() {
        return aankoopPrijs / voorzieneLevensduur;
    }

    @Override
    public double bedragKost() {
        return kostPerKm * aantalKm;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }
}
