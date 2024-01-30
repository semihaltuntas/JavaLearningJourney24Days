package be.vdab.hello.jp10Inheritance;

import java.util.Objects;

public abstract class Rekening {

    private String rekeningNummer;
    private double saldo;


    public Rekening(String rekeningNummer) {
        setRekeningNummer(rekeningNummer);
    }

    public Rekening(String rekeningNummer, Double saldo) {
        setRekeningNummer(rekeningNummer);
        if (saldo >= 0) {
            this.saldo = saldo;
        }
        System.out.println("HashCode :"+Objects.hash(rekeningNummer,saldo));
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public final void setRekeningNummer(String reknr) {
        Objects.requireNonNull(reknr);
        if (!reknr.isBlank()) {
            rekeningNummer = reknr;
        }
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void storten(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }

    public void afhalen(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
        }
    }

    public void overschrijven(Rekening rek, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            rek.storten(bedrag);
        }
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }

    @Override
    public String toString() {
        return rekeningNummer+ ", "+ saldo;
    }
    public abstract double berekenIntrest();

    @Override
    public int hashCode() {
        return Objects.hash(rekeningNummer, saldo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==obj) return true;
        if (!(obj instanceof Rekening rekening)) return false;
        return rekeningNummer.equals(rekening.getRekeningNummer());
    }
}
