package be.vdab.hello.jp20CollectionsCursusTreeSet;

import java.util.Objects;

public class Cursus implements Comparable<Cursus> {
    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus(int cursusNr, String cursusNaam, int prijs) {
        setCursusNr(cursusNr);
        setCursusNaam(cursusNaam);
        setPrijs(prijs);
    }

    public void setCursusNr(int cursusNr) {
        if (cursusNr > 0)
            this.cursusNr = cursusNr;
    }

    public int getCursusNr() {
        return cursusNr;
    }

    public void setCursusNaam(String cursusNaam) {
        Objects.requireNonNull(cursusNaam);
        if (!cursusNaam.trim().isBlank())
            this.cursusNaam = cursusNaam;
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public void setPrijs(int prijs) {
        if (prijs > 0)
            this.prijs = prijs;
    }

    public int getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return (cursusNr + " ; " + cursusNaam + " ; " + prijs);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cursus)) {
            return false;
        }
        Cursus cursus = (Cursus) o;
        return cursusNr == cursus.getCursusNr();
    }


    @Override
    public int hashCode() {
        return Objects.hash(cursusNr);
    }

    @Override
    public int compareTo(Cursus c) {
        //sorteren op cursusnr
//        if (cursusNr < c.getCursusNr())
//            return -1;
//        else if (cursusNr > c.getCursusNr())
//            return 1;
//        else return 0;
//        return c.getCursusNr() - cursusNr;
//        return cursusNr - c.getCursusNr();


        // sorteren op cursusPrijs: consistent met equals()
        if (this.equals(c)) {
            return 0;
        } else {
            return this.prijs <= c.getPrijs() ? -1 : 1;
        }

        //  return prijs == c.getPrijs() ? 0 : prijs <= c.getPrijs() ? -1 : 1;
    }

//        return this.cursusNaam.compareTo(c.getCursusNaam());

}



