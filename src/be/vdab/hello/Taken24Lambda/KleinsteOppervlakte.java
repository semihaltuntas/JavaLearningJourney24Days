package be.vdab.hello.Taken24Lambda;





import be.vdab.hello.jp24LambdaExpressions.Rechthoek;

import java.util.List;

public class KleinsteOppervlakte {

    private final int breedte;
    private final int lengte;

    public KleinsteOppervlakte(int breedte, int lengte) {
        this.breedte = breedte;
        this.lengte = lengte;
    }
    public int getOppervlakte(){
        return breedte*lengte;
    }

    @Override
    public String toString() {
        return breedte+ " to "+ lengte;
    }
}
     class Main{

        public static void main(String[] args) {

           var rechthoeken=  List.of(new KleinsteOppervlakte(5,10),new KleinsteOppervlakte(3,4),
                   new KleinsteOppervlakte(7,10));
           var kleinsteOppervlakte = rechthoeken.stream()
                   .mapToInt(rechthoek-> rechthoek.getOppervlakte())
                   .min();
            kleinsteOppervlakte.ifPresent(oppervlakte->{
                System.out.println(oppervlakte);
                rechthoeken.stream()
                        .filter(rechthoek->rechthoek.getOppervlakte() == oppervlakte)
                        .forEach(rechthoek-> System.out.println(rechthoek));
            });

        }
    }

