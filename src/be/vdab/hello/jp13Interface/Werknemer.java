package be.vdab.hello.jp13Interface;

public class Werknemer implements Kost {

    String naam;
    double wedde;

    public Werknemer(String naam, double wedde) {
        this.naam = naam;
        this.wedde = wedde;
    }

    public String getNaam() {
        return naam;
    }

    public double getWedde() {
        return wedde;
    }

    @Override
    public String toString() {
        return "Werknemer{" +
                "naam='" + naam + '\'' +
                ", wedde=" + wedde +
                '}';
    }

    @Override
    public double bedragKost() {
        return wedde;
    }

    @Override
    public boolean personeelsKost() {
        return true;
    }
}
