package be.vdab.hello.jp24LambdaExpressions;

import java.util.Arrays;
import java.util.stream.Stream;

public class WerkMeerdereStreams {
    public static void main(String[] args) {
        Stream.of(Stream.of("Joe","Jack"),Stream.of("William","Avarell"))
                .flatMap(stream ->stream)
                .forEach(voornaam-> System.out.println(voornaam));
        System.out.println("-----");
        Stream.of("The lord of the rings", "The Hobbit")
                .map(titel->titel.split(" "))
                .flatMap(array-> Arrays.stream(array))
                .map(woord->woord.toLowerCase())
                .distinct()
                .sorted()
                .forEach(woord-> System.out.println(woord));


    }
}
