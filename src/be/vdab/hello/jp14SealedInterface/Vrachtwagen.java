package be.vdab.hello.jp14SealedInterface;

public non-sealed class Vrachtwagen extends Voertuig implements Onderhoud{
    @Override
    public int onderhoudsbeurtNaAantalKilometeres() {
        return 0;
    }
}
