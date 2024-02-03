package be.vdab.hello.Taken20CollectionsTienkamper;

import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper> {
    private String naam="";
    private int punten;

    public Tienkamper(String naam, int punten) {
     setNaam(naam);
     setPunten(punten);
    }

    public void setNaam(String naam) {
        if (naam != null)
        this.naam = naam;
    }

    public void setPunten(int punten) {
        if (punten > 0)
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public int getPunten() {
        return punten;
    }

    @Override
    public String toString() {
        return naam+ " : "+punten;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tienkamper andere)){
            return false;
        }
        return naam.equals(andere.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }

    @Override
    public int compareTo(Tienkamper o) {
//        return naam.compareTo(o.naam);
        return punten - o.punten;
    }
}
