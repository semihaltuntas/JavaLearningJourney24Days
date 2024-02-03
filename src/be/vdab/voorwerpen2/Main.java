package be.vdab.voorwerpen2;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        var voorwerpen = new Voorwerp[4];

        try {
            voorwerpen[0] = new LeesBoek();
        } catch (Isbn13Exception ex) {
            System.out.println("0 :" + ex.getMessage());
        }

        try {
            voorwerpen[1] = new LeesBoek("978-0-306-40615-7", "Studieboek Java 7", "Oracle", 20.4F,
                    "Genre Informatica", "onderw programmeren");
        } catch (Isbn13Exception ex) {
            System.out.println("1 :" + ex.getMessage());
        }
        try {
            voorwerpen[2] = new Woordenboek("978-90-664-8143-9",
                    "Woordenboek Engels", "Van Dale", 30.10F,
                    "genre vertaal woordenboek", "taal Engels-Nederlands");

        } catch (Isbn13Exception ex) {
            System.out.println("2 : "+ex.getMessage()+ "978-90-664-8143-9 ");
        }

        System.out.println("------");

        var totaleWinst = 0;
        for (var eenVoorwerp : voorwerpen) {
            System.out.println(eenVoorwerp);
            if (eenVoorwerp != null) {
                eenVoorwerp.gegevensTonen();
                System.out.println("-----");
                totaleWinst += eenVoorwerp.winstBerekenen();

            }

        }
        System.out.println("DE TOTALE WİNST BEDRAAGT :"+ totaleWinst);


    }

}

