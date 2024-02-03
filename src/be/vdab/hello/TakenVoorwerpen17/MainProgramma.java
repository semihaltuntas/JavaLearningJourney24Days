package be.vdab.hello.TakenVoorwerpen17;

public class MainProgramma {
    public static void main(String[] args) {

        var boekenrek = new Boekenrek[4];

        Voorwerp[] voorwerpen = {
                new Boekenrek(),
                new Boekenrek(75, 90, 28.5F),
                new LeesBoek(),
                new LeesBoek("Leesboek Java 7", "Oracle", 20.4F,
                        "genre Informatica", "onderw programmeren"),
                new Woordenboek(),
                new Woordenboek("Woordenboek Engels", "Van Dale", 30.10F,
                        "genre vertaal woordenboek", "taal Engels-Nederlands")
        };
        var totalewinst = 0.0F;


        for (int i = 0; i < voorwerpen.length ; i++) {
            voorwerpen[i].gegevensTonen();
            System.out.println("-----//-----");
            totalewinst += voorwerpen[i].winstBerekenen();
        }
//        for (var voorwerp : voorwerpen) {
//            voorwerp.gegevensTonen();
//            System.out.println("---------");
//            totalewinst += voorwerp.winstBerekenen();
//        }
        System.out.println("DE TOTALE WİNST BEDRAAGTTT  = " + totalewinst);
    }
}