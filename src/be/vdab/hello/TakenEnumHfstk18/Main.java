package be.vdab.hello.TakenEnumHfstk18;

public class Main {
    public static void main(String[] args) {

        var persoon1 = new Persoon("Semih","ALTUNTAS",Geslacht.MAN);
        var persoon2 = new Persoon("Esra","ALTUNTAS",Geslacht.VROUW);
        var persoon3 = new Persoon("ZELİHA", "ALTUNTAS",Geslacht.VROUW);

       for (var geslacht : Geslacht.values()){
           System.out.println("geslachten : " +geslacht);
       }
        System.out.println(persoon1 + "\n" + persoon2 + "\n" + persoon3 );

    }
}
