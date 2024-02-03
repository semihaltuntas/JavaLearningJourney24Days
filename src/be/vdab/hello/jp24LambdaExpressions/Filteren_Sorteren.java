package be.vdab.hello.jp24LambdaExpressions;

import java.util.Comparator;
import java.util.stream.Stream;

public class Filteren_Sorteren {
    public static void main(String[] args) {

        // **FİLTEREN** //

        //1.yol
        Stream<String> groenten = Stream.of("sla", "wortel", "kool", "biet");
        var stream = groenten.filter(groente -> groente.length() == 4);
        stream.forEach(groente4letters -> System.out.println(groente4letters));

        System.out.println("*-----*");

        //2.yol
        Stream.of("elma", "kiraz", "vişne", "armut").filter
                (meyve -> meyve.length() == 5).sorted().forEach
                (meyve5Harfli -> System.out.println(meyve5Harfli));

        // ** SORTEREN ** //

        System.out.println("--Sorteer Alfabethic--");
        Stream.of("sla","wortel","kool","biet").sorted().
                forEach(groente-> System.out.println(groente));

        System.out.println("--Sorteer Length--");
        Stream.of("sla","wortel","kool","biet").sorted((groente1,groente2)->
                groente1.length() -groente2.length()).forEach(groente-> System.out.println(groente));

        // COMPARATOR önce birincil bir kritere göre ve ardından ikincil bir kritere göre sıralamak
        System.out.println("--Met Comparator 2 criteria sorteer--");

        // Uzunluklarına gore sıralıyor ılk once,sonra uzunluk esıtse alfabetık sıraya gore...!
        Comparator<String> comparator=
                (groente1,groente2)->groente1.length()-groente2.length();
        comparator=comparator.thenComparing(
                (groente1,groente2)->groente1.compareTo(groente2));
        Stream.of("sla","wortel","kool","biet","banana","appel","cherry").sorted(comparator).
                forEach(groente-> System.out.println(groente));

        //Unieke waarden
        System.out.println("--Uniek--");
        Stream.of("sla","wortel","kool","biet","sla","appel","sla").
                distinct().forEach(groente-> System.out.println(groente));
        //Transformeren met Map
        System.out.println("--Map--");
        Stream.of("sla","wortel","kool","biet","sla","appel","sla").
                map(groente->groente.length()).forEach(lengte-> System.out.println(lengte));
    }

}
