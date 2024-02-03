package be.vdab.hello.TakenVoorwerpen17;



public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;

    public Boek() {
    }

    public Boek(String titel, String auteur, float aankoopprijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
    }


    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitel(String titel) {
        if (titel != null)
            this.titel = titel;
    }

    public void setAuteur(String auteur) {
        if (auteur != null)
            this.auteur = auteur;
    }

    public void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0.0)
            this.aankoopprijs = aankoopprijs;
    }

    public void setGenre(String genre) {
        if (genre != null)
            this.genre = genre;
    }


    @Override
    public void gegevensTonen() {
        System.out.println("Gegevens van een boek =");
        System.out.println("Titel  :" + titel);
        System.out.println("Auteur  :" + auteur);
        System.out.println("Eigenaar  :" + eigenaar);
        System.out.println("Aankoopprijs  :" + aankoopprijs);
        System.out.println("Genre  :" + genre);
    }

    @Override
    public String toString() {
        return "Boek{" +
                "titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", eigenaar='" + eigenaar + '\'' +
                ", aankoopprijs=" + aankoopprijs +
                ", genre='" + genre + '\'' +
                '}';
    }



}
