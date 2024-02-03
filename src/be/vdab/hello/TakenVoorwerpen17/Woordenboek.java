package be.vdab.hello.TakenVoorwerpen17;

public class Woordenboek extends Boek {
    private String taal;
    private static final float winstmarge = 1.75F;

    public Woordenboek() {
        this("Woordenboek Nederlands", "van SEMİH", 35.0F,
                "Genre vertaal woordenBoek", "taal Turks-Nederlands");

    }

    public Woordenboek(String titel, String aeteur, float aankoopPrijs, String genre,
                       String taal) {
        super(titel, aeteur, aankoopPrijs, genre);
        setTaal(taal);

    }

    public void setTaal(String taal) {
        if (taal != null)
            this.taal = taal;
    }


    public String getTaal() {
        return taal;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    @Override
    public float winstBerekenen() {
        return getAankoopprijs() * winstmarge;
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("taal :" + taal);
        System.out.println("Winstmarge :" + winstmarge);
    }

    @Override
    public String toString() {
        return super.toString() + "Woordenboek{" +
                "taal='" + taal + '\'' +
                ", winstmarge=" + winstmarge +
                '}';
    }
}
