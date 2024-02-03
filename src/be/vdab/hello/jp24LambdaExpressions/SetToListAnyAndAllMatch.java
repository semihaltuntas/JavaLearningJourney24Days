package be.vdab.hello.jp24LambdaExpressions;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetToListAnyAndAllMatch {
    public static List<String> gesorteerdeGroenten() {
        return Stream.of("sla", "wortel", "kool", "biet")
                .sorted()
                .toList();
    }

    public static Set<String> setGesorteerdeFruiten() {
        return Stream.of("elma", "muz", "portakal", "muz", "elma")
                .sorted()
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        //AllMatch = false
        System.out.println(Stream.of("sla", "wortel", "kool", "biet")
                .allMatch(groente -> groente.length() == 4));
        //AnyMatch = true
        System.out.println(Stream.of("sla", "wortel", "kool", "biet")
                .anyMatch(groente -> groente.length() == 4));

        //toList
        System.out.println("--- Met toList liste yapar ---");
        System.out.println(gesorteerdeGroenten());

        // Set
        System.out.println("--Met Set sadece bı kere yazar aynı elemanları");
        System.out.println(setGesorteerdeFruiten());

        //Map
        System.out.println("---Map Collectors---");
        Map <Integer,List<String>>groentenPerLengte =
                Stream.of("sla", "wortel", "kool", "biet","semıh")
                        .collect(Collectors.groupingBy(groente -> groente.length()));
//
//        groentenPerLengte.forEach((k,v)->{
//            System.out.print(k);
//            System.out.println("  " +v);
//        });
        groentenPerLengte.entrySet().stream()
                .forEach(entry -> {System.out.println(entry.getKey());
                    entry.getValue()
                            .stream().forEach(groente -> System.out.println(groente));
                    System.out.println("---");
                });

        //String => Collectors.joining
        System.out.println("--Collectors Joining--");
        System.out.println(Stream.of("sla", "wortel", "kool", "biet")
                .collect(Collectors.joining(", ")));

    }


}


