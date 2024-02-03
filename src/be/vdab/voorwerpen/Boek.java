package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;
import be.vdab.util.Isbn13Exception;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;
    private String isbn13;

    public Boek() {
    }

    public Boek(String isbn13, String titel, String auteur, float aankoopprijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
        setIsbn13(isbn13);
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

    public final void setIsbn13(String isbn13) {
        System.out.println(isbn13);
        if (controleerIsbnNummer(isbn13.replaceAll("-","")))
            this.isbn13 = isbn13;
        else {
            throw new Isbn13Exception("laaste cijfer is on geldig");
        }
    }


    public String getIsbn13() {
        return isbn13;
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
        System.out.println("İsbn13  :" + isbn13);
        System.out.println("Titel  :" + titel);
        System.out.println("Auteur  :" + auteur);
        System.out.println("Eigenaar  :" + eigenaar);
        System.out.println("Aankoopprijs  :" + aankoopprijs);
        System.out.println("Genre  :" + genre);
    }

    @Override
    public String toString() {
        return "Boek{" +
                "İsbn13='" + isbn13 + '\'' +
                "titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", eigenaar='" + eigenaar + '\'' +
                ", aankoopprijs=" + aankoopprijs +
                ", genre='" + genre + '\'' +
                '}';
    }

    public boolean controleerIsbnNummer(String isbn13) {
        System.out.println(isbn13);
        if (isbn13 == null || isbn13.isBlank() || isbn13.length() != 13) {
            return false;
        }
        try {
            int sum = 0;
            int factor;

            //Voorbeeld: 978-0-306-40615-7
            for (int i = 0; i < 12; i++) {
                int digit = Integer.parseInt(isbn13.substring(i, i + 1));
                factor = (i % 2 == 0) ? 1 : 3;
                sum += digit * factor;
                System.out.println("sum : " + sum);
            }

            var checksum = 10 - (sum % 10);
            if (checksum == 10) {
                checksum = 0;

            }
            System.out.println(checksum);
            return checksum == Integer.parseInt(isbn13.substring(12));
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
