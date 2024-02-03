package be.vdab.hello.TakenVoorwerpen17;

public class Boekenrek implements Voorwerp {
    private int hoogte = 0;
    private int breedte = 0;
    private float aankoopprijs = 0;

    private static final float winstmarge = 2.0F;

    public Boekenrek() {
        this(175,100,40.0F);
    }

    public Boekenrek(int hoogte, int breedte, float aankoopprijs) {
        setAankoopprijs(aankoopprijs);
        setBreedte(breedte);
        setHoogte(hoogte);
    }

    public String getEigenaar() {
        return eigenaar;
    }



    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0.0)
            this.aankoopprijs = aankoopprijs;
    }

    public float getWinstmarge() {
        return winstmarge;
    }


    public int getHoogte() {
        return hoogte;
    }

    public final void setHoogte(int hoogte) {
        if (hoogte > 0)
            this.hoogte = hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public final void setBreedte(int breedte) {
        if (breedte > 0)
            this.breedte = breedte;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("Gegevens van de BOEKENREK :");
        System.out.println("Het boekenrek is " + hoogte + " cm hoog en " + breedte + " cm bereed.");
        System.out.println("Het is eigendom van : " + eigenaar);
        System.out.println("Aankoopprijs :" + getAankoopprijs());
        System.out.println("Winst :" + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return aankoopprijs * winstmarge;
    }

    @Override
    public String toString() {
        return "Boekenrek{" +
                "eigenaar='" + eigenaar + '\'' +
                ", hoogte=" + hoogte +
                ", breedte=" + breedte +
                ", aankoopprijs=" + aankoopprijs +
                ", winst="+ winstmarge +
                '}';
    }
}
