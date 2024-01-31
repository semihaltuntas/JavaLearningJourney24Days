package be.vdab.hello.jp14SealedInterface;

public sealed interface Onderhoud permits Vrachtwagen, Sportwagen {

    default int aantalOnderhoudsBeurtenPerJaar() {
        return 1;
    }

    int onderhoudsbeurtNaAantalKilometeres();
}
