package be.vdab.hello.jp14SealedInterface;

import java.util.List;

public class MainProgramma {
    public static void main(String[] args) {

        Vrachtwagen vrachtwagen = new Vrachtwagen();
        Sportwagen sportwagen = new Sportwagen();
        List<? extends Voertuig> voertuigen = List.of(vrachtwagen, sportwagen);

        for (var voertuig : voertuigen) {
            System.out.println(soortVoertuig(voertuig));
        }


    }

    public static String soortVoertuig(Voertuig voertuig) {
        return switch (voertuig) {
            case Vrachtwagen vrachtwagen -> vrachtwagen + " is een vrachtwagen";
            case Sportwagen sportwagen -> sportwagen + " is een sportwagen";
        };
    }
}
