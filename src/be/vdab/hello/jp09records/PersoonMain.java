package be.vdab.hello.jp09records;

public class PersoonMain {
    public static void main(String[] args) {
        var persoon1 = new Persoon("semih","Altuntas");
        System.out.println(persoon1.naam());
        System.out.println(persoon1.voornaam());
        System.out.println(persoon1);
    }


}
