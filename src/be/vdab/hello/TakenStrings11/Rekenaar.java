package be.vdab.hello.TakenStrings11;

public class Rekenaar {

    private String tekst;
    private int totaal;

    public Rekenaar(String input) {
        tekst = input;
        totaal = berekenen(input);
    }

    public void setTekst(String input) {
        tekst = input;
        totaal = berekenen(input);
    }

    public String getTekst() {
        return tekst;
    }

    public int getTotaal() {
        return totaal;
    }

    private int berekenen(String expressie) {
        var delen = expressie.split(" ");
        if (!delen[0].equals("")) {
            totaal = Integer.parseInt(delen[0]);
        } else {
            totaal = 0;
        }
        int i = 1;
        while (i < delen.length) {
            var bewerkingsTeken = delen[i].charAt(0);
            i++;
            if (i < delen.length) {
                var getal = Integer.parseInt(delen[i]);
                voerUit(bewerkingsTeken, getal);
                i++;
            }
        }
        return totaal;
    }

    private void voerUit(char bewTeken, int getal) {
        switch (bewTeken) {
            case '+' -> totaal += getal;
            case '-' -> totaal -= getal;
            case '*' -> totaal *= getal;
            case '/' -> {
                if (getal != 0) {
                    totaal /= getal;
                }
            }
        }
    }

    @Override
    public String toString() {
        return tekst + "- "+ totaal;
    }
}