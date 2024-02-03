package be.vdab.hello.TakenVoertuigenInheritance10;

public class Personenwagen extends Voertuig implements Vervuiler {
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;

    public Personenwagen(){
    };

    public Personenwagen(String polishouder, float kostPrijs, int pk, float gemVerbruik,
                         String nummerPlaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostPrijs, pk, gemVerbruik, nummerPlaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ,aantalDeuren :" + aantalDeuren + " ,aantalPassagiers :" + aantalPassagiers;
    }

    @Override
    public void toon() {
        System.out.println("(/n PERSONENWAGEN)");
        super.toon();
        System.out.println("deuren :" + aantalDeuren);
        System.out.println("passagiers :" + aantalPassagiers);
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5.0F;
    }
}
