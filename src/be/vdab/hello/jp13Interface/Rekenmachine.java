package be.vdab.hello.jp13Interface;

public interface Rekenmachine {
    default void toonAllEvenNummers(int... nummers){
        int som = 0;
        for (var nummer : nummers){
            if (nummer % 2 == 0){
                som+=nummer;
            }
        }
        toonSom(som);
    }

    default void toonAlleOnevenNummers(int... nummers){
        int som = 0;
        for (var nummer : nummers){
            if (nummer % 2 != 0){
                som+=nummer;
            }
        }
        toonSom(som);
    }

    private void toonSom(int som){
        System.out.println("De som :"+ som);
    }
}
