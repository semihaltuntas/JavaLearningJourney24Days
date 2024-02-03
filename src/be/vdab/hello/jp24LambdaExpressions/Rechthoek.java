package be.vdab.hello.jp24LambdaExpressions;

import java.util.stream.Stream;

public class Rechthoek {
    private final int lengte;
    private final int breedte;

    Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    int getOppervlakte() {
        return lengte * breedte;
    }
}
class Mainn{
    public static void main(String[] args) {
        Stream.of(new Rechthoek(6, 2), new Rechthoek(3, 1),
                        new Rechthoek(5, 4))
                .map(rechthoek -> rechthoek.getOppervlakte())
                .sorted()
                .forEach(oppervlakte -> System.out.println(oppervlakte));
    }
}







