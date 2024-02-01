package be.vdab.hello.jp17Enum;

public class Main {
    public static void main(String[] args) {
        var zaaiSeizonen = Seizoen.LENTE;
        var skiSeizonen = Seizoen.WINTER;
        System.out.println("zaaiSeizonen = " + zaaiSeizonen);
        System.out.println("skiSeizonen = " + skiSeizonen);
        System.out.println("------------");

        for (var seizoen : Seizoen.values()) {
            System.out.println("seizoen = " + seizoen);
        }
        System.out.println("------------");
        var zwemSeizonen = Seizoen.valueOf("ZOMER");
        System.out.println(zwemSeizonen.ordinal());

        var skiSeizoen = Seizoen.WINTER;
        System.out.println(skiSeizoen.getBeginMaand());
        System.out.println("-----------");
        for (var seizoen : Seizoen.values()) {
            System.out.println(seizoen + ":" + seizoen.getBeginMaand());
        }


    }
}
