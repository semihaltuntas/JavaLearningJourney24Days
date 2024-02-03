package be.vdab.hello.jp24LambdaExpressions;

import java.math.BigDecimal;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StatistiekenCountSumVb {
    public static void main(String[] args) {
        // aantal waarden in de Stream
        System.out.println("Aantal :");
        System.out.println(Stream.of("sla", "wortel", "kool", "biet").count());
        //sum alle waarden
        System.out.println("Som :");
        var stream = IntStream.of(3, 4, 5, 6, 7);
//        System.out.println(stream.sum());
        //Kleinste
        System.out.println("Kleinste :");
        stream.min().ifPresent(kleinste -> System.out.println(kleinste));
        //3 keer schrijven
        System.out.println("3 keer :");
        IntStream.range(0, 3).forEach(ss -> System.out.println("ahmet"));
        //mapToInt van Stream naar een IntStream
        System.out.println("naar IntStream :");
        System.out.println(Stream.of("sla", "wortel", "kool", "biet")
                .mapToInt(groente -> groente.length())
                .sum());

        //Big Decimal
        System.out.println("--Big Decimal/Max of Min --");
        Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .max((getal1, getal2) -> getal1.compareTo(getal2))
                .ifPresent(kleinsteWaarde -> System.out.println(kleinsteWaarde));

        //Met Reduce
        System.out.println("--Som van getallen Met Reduce--");
        Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .reduce((vorigeSom, getal) -> vorigeSom.add(getal))
                .ifPresent(som -> System.out.println(som));

    }
}
