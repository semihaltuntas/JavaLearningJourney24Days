package be.vdab.hello.jp08;

public class Spaarekening {
    private String rekeningNummer;
    private double saldo;
    public static double intrest;

    public Spaarekening() {
        rekeningNummer = "BE12 3456 7890 1234";
        intrest = 2.0;

    }

    public Spaarekening(String reknr, double intrest) {
        rekeningNummer = reknr;
        this.intrest = intrest;
    }

    public Spaarekening(String reknr, double intrest, double saldo) {
        this(reknr, intrest);
        this.saldo = saldo;
    }

    public String getRekeningNummer() {
        return this.rekeningNummer;
    }

    public void setRekeningNummer(String reknr) {
        rekeningNummer = reknr;
    }

    public double getSaldo() {
        return saldo;
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

    public void overschrijven(Spaarekening spaarRek, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            spaarRek.storten(bedrag);
        }
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }
    public static double getIntrest(){
        return intrest;
    }
    public static int somVanAlleGetallen(int[] getallen) {
        int som = 0;
        for (int getal : getallen) {
            som += getal;
        }
        return som;

    }
}


