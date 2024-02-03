package be.vdab.hello.TakenVoertuigenInheritance10;

public abstract class Voertuig implements Privaat, Milieu {
    private String polishouder = "onbepaald";
    private String nummerPlaat = "onbepaald";
    private float kostPrijs;
    private float gemVerbruik;
    private int pk;

    public Voertuig() {
    }

    public Voertuig(String polishouder, float kostPrijs, int pk,
                    float gemVerbruik, String nummerPlaat) {
        setPolishouder(polishouder);
        setGemVerbruik(gemVerbruik);
        setKostPrijs(kostPrijs);
        setPk(pk);
        setNummerPlaat(nummerPlaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public String getNummerPlaat() {
        return nummerPlaat;
    }

    public float getKostPrijs() {
        return kostPrijs;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public int getPk() {
        return pk;
    }

    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isBlank()) {
            this.polishouder = polishouder;
        }
    }

    public final void setNummerPlaat(String nummerPlaat) {
        if (nummerPlaat != null && !nummerPlaat.isBlank()) {
            this.nummerPlaat = nummerPlaat;
        }
    }

    public final void setKostPrijs(float kostPrijs) {
        if (kostPrijs > 0.0F) {
            this.kostPrijs = kostPrijs;
        }
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F) {
            this.gemVerbruik = gemVerbruik;
        }
    }

    public final void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk;
        }
    }

    @Override
    public String toString() {
        return polishouder + " ," + kostPrijs + " ," + pk + " ," + gemVerbruik + " ," + nummerPlaat;
    }

    public void toon() {
        System.out.println("Voertuigen Gegevens :");
        System.out.println("Polishouder :" + polishouder);
        System.out.println("Kostprijs :" + kostPrijs + " euro");
        System.out.println("Pk :" + pk);
        System.out.println("Gemiddelde Verbruik :" + gemVerbruik);
        System.out.println("nummerPlaat :" + nummerPlaat);
    }

    public abstract double getKyotoScore();

    @Override
    public void geefPrivateData() {
        System.out.println("--Private Datas--");
        System.out.println("Polishouder :" + getPolishouder());
        System.out.println(" nummer plaat :" +  getNummerPlaat());
    }

    @Override
    public void geefMilieuData() {
        System.out.println("--Milieu Datas--");
        System.out.println("PK :" + getPk());
        System.out.println("Kostprijs :"+ getKostPrijs());
        System.out.println("Verbruik :"+ getGemVerbruik());
    }
}
