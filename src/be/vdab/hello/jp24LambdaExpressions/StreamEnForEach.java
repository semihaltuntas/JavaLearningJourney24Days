package be.vdab.hello.jp24LambdaExpressions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEnForEach {
    private static final Path PATH = Path.of("/data/languages.txt");
    private static final Path PATH1 = Path.of("/data");

    public static void main(String[] args) {
        //met Array
        String[] groenten = {"tomaat", "prei", "ui", "sla"};

//        var stream = Arrays.stream(groenten);
//        stream.forEach(groente -> System.out.println(groente));
        Arrays.stream(groenten).forEach(groente -> System.out.println(groente.toUpperCase()));
        System.out.println("----------");
        //met List

        List<String> groenten1 = List.of("tomaat", "prei", "ui", "sla");
        groenten1.stream().forEach(groente -> System.out.println(groente));


        //met Set
        var heiligeGetallen = new LinkedHashSet<Integer>();

        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);
        heiligeGetallen.stream().forEach(getal -> System.out.println(getal));

        //met Map
        LinkedHashMap<String, String> talen = new LinkedHashMap<>();

        talen.put("NL", "Nederland");
        talen.put("BE", "Belgie");
        talen.put("TR", "Turkey");
        talen.put("FR", "Frankrijk");
        talen.entrySet().stream().forEach
                (land -> System.out.println(land.getKey() + " : " + land.getValue()));

        System.out.println("-----");

        //Met String
        "Lambdafun".chars().forEach(unicode -> System.out.println((char) unicode));

        //Met TekstBestand -- Path

        System.out.println("------");

        try (var stream = Files.lines(PATH)) {
            stream.forEach(regel -> System.out.println(regel.toUpperCase()));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("------------");
        // Met Directory

        try (var stream = Files.list(PATH1)) {
            stream.forEach(entry -> System.out.println(entry.getFileName()));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }

        System.out.println("-------");
        // Met Losse waarden

        Stream.of("Adam", "Eva", "Josef", "Jakop").forEach
                (naam -> System.out.println(naam));

        // Oneindige reeks waarden : Sonsuz küme
        System.out.println("-------");

        Stream.iterate(1, vorigGetal -> vorigGetal + 2).limit(10).forEach
                (onevengetal -> System.out.println(onevengetal));

        // Getallenreeks : Sayı serisi
        System.out.println("--------");

        IntStream.rangeClosed(1, 10).forEach(getal -> System.out.println(getal)); // bıtıs ve baslangıc degerlerı gecerli.
        IntStream.range(1, 10).forEach(getal -> System.out.println(getal)); //bitis degerı haric


    }
}
