package be.vdab.voorwerpen2;


public class LeesBoek extends Boek {
    private String onderwerp;
    private static final float winstmarge = 1.5F;

    public LeesBoek() {
        this("978-05-960-0920-5","Leesboek Php","Php",10.5F,
                "genre vertaal woordenboek","taal Turks en Engels");
    }

    public LeesBoek(String isbn13,String titel, String auteur, float aankoopprijs,
                    String genre, String onderwerp) {
        super( isbn13,titel, auteur, aankoopprijs, genre);
        setOnderwerp(onderwerp);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        if (onderwerp != null)
            this.onderwerp = onderwerp;
    }

    public float getWinstmarge() {
        return winstmarge;
    }


    @Override
    public float winstBerekenen() {
        return super.getAankoopprijs() * winstmarge;
    }

    @Override
    public String toString() {
        return super.toString() + "LeesBoek{" +
                "onderwerp='" + onderwerp + '\'' +
                ", winstmarge=" + winstmarge +
                '}';
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Onderwerp :"+ onderwerp);
        System.out.println("Winst :"+ winstBerekenen());
    }
}
