package be.vdab.voorwerpen2;



public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;
    private String isbn13;


    public Boek() {
    }

    public Boek(String isbn13,String titel, String auteur, float aankoopprijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
        setIsbn13(isbn13);
    }

    public void setIsbn13(String isbn13) {
        if (checkedIsbnNummer(isbn13)){
            this.isbn13 = isbn13;
        }else {
            throw new Isbn13Exception("Ongeldig IsbnNummer :");
        }
    }

    public String getIsbn13() {
        return isbn13;
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
        System.out.println("İsbnNr  :" +isbn13);
        System.out.println("Titel  :" + titel);
        System.out.println("Auteur  :" + auteur);
        System.out.println("Eigenaar  :" + eigenaar);
        System.out.println("Aankoopprijs  :" + aankoopprijs);
        System.out.println("Genre  :" + genre);
    }

    @Override
    public String toString() {
        return "Boek{" + "isbnNr="+isbn13+
                "titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", eigenaar='" + eigenaar + '\'' +
                ", aankoopprijs=" + aankoopprijs +
                ", genre='" + genre + '\'' +
                '}';
    }

    //Voorbeeld: 978-0-306-40615-7
    public final boolean checkedIsbnNummer(String isbn13) {
        var getStrepjes = isbn13.replaceAll("-", "");
        System.out.println(getStrepjes);
        if (isbn13 == null || isbn13.isBlank() || getStrepjes.length() != 13) {
            return false;
        }
        // 9780306406157
        try{
            int sum = 0;
            int factor;

            for (int i = 0; i < 12 ; i++) {

                int isbnNummer = Integer.parseInt(getStrepjes.substring(i, i + 1));
                factor = (i % 2 == 0) ? 1 : 3;
                sum += isbnNummer * factor;
//                System.out.println("sum :"+ sum);
            }
                var sumcheck = 10 - (sum % 10);
                if (sumcheck == 10) {
                    sumcheck = 0;
                }
            System.out.println(sumcheck);
                return sumcheck == Integer.parseInt(getStrepjes.substring(12));

        }catch (NumberFormatException ex){
            return false;
        }
    }
}
