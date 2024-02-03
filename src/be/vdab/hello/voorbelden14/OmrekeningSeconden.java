package be.vdab.hello.voorbelden14;

public class OmrekeningSeconden {
    public static void main(String[] args) {

        int aantalSeconden = 5924;

        int uren = aantalSeconden / 3600;
        int minuten = (aantalSeconden % 3600) / 60;
        int seconden = aantalSeconden % 60;

        System.out.println("U:" + uren + " M:" + minuten + " S:" + seconden);


    }
}
