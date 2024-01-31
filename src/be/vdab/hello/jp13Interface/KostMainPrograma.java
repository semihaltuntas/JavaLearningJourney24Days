package be.vdab.hello.jp13Interface;

public class KostMainPrograma {
    public static void main(String[] args) {
        Werknemer eddy = new Werknemer("Eddy", 2000.0);
        Werknemer elly = new Werknemer("Elly",2500.0);
        Vrachtwagen daf = new Vrachtwagen("Daf",0.35,25000,150000.0,8);
        Kopieermachine konica = new Kopieermachine("Konica",0.02,9000);

        var personeelsKosten = 0.0;
        var andereKosten = 0.0;

        //kosten van Eddy tellen
        if (eddy.personeelsKost()){
            personeelsKosten += eddy.bedragKost();
        }else {
            andereKosten += eddy.bedragKost();
        }

        //kosten van Elly tellen
        if (elly.personeelsKost()){
            personeelsKosten+= elly.bedragKost();
        }else{
            andereKosten += elly.bedragKost();
        }

        //kosten van Konica tellen
        if (konica.personeelsKost()){
            personeelsKosten = personeelsKosten + konica.bedragKost();
        }else{
            andereKosten = andereKosten + konica.bedragKost();
        }

        //kosten van Daf tellen
        if (daf.personeelsKost()){
            personeelsKosten += daf.bedragKost();
        }else{
            andereKosten += daf.bedragKost();
        }


        System.out.println("PersoneelsKosten :" + personeelsKosten);
        System.out.println("Andere kosten :" + andereKosten);

        Afschrijving.beschrijving();



    }
}
