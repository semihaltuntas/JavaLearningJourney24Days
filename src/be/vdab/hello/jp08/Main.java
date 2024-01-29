package be.vdab.hello.jp08;

public class Main {
    public static void main(String[] args) {
        double standSpaarrekening;

        Spaarekening spaar = new Spaarekening();
        System.out.println(spaar.getSaldo());

        String s = "BE12 3456 7890 1234";
        System.out.println(s);


        var spaar1 = new Spaarekening("BE12 3456 7890 1234", 1.5);
        var spaar2 = new Spaarekening("BE98 7654 3210 9876", 1.5);
//        var spaar3 = new Spaarekening("fasfasfas", 1.2);
        var spaar3 = new Spaarekening();
        var intrestPercentage = Spaarekening.getIntrest();

        System.out.println("intrest : " + intrestPercentage);

        spaar3.storten(150);
        spaar1.storten(-100.0);
        standSpaarrekening = spaar1.getSaldo(); //saldonun guncel hhalı verıyor


        System.out.println("Saldo van spaarrekening 1: " + standSpaarrekening);
        System.out.println("Saldo van spaarrekening 2: " + spaar2.getSaldo());
        System.out.println("Saldo van spaarrekening 3: " + spaar3.getSaldo());
        spaar1.overschrijven(spaar2, 25.0);   //saldo 75
        System.out.println("Saldo van spaarrekening 1 " + spaar1.getRekeningNummer() + " is " + spaar1.getSaldo());

        System.out.println("Saldo van spaarrekening 2 " + spaar2.getRekeningNummer() + " is " + spaar2.getSaldo());
        System.out.println("Saldo van spaarrekening 3 " + spaar3.getRekeningNummer() + " is " + spaar3.getSaldo());

        spaar2.afhalen(5.0);
        System.out.println("Saldo van spaarrekening 2 " + spaar2.getRekeningNummer() + " is " + spaar2.getSaldo());


        System.out.println();
    }
}
