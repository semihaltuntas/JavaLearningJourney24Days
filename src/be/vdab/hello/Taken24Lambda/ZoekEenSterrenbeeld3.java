package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ZoekEenSterrenbeeld3 {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        System.out.println("Tik een woord alsjeblieft!");
        Scanner scanner = new Scanner(System.in);
        String woord = scanner.nextLine().toUpperCase();


        try (var stream = Files.lines(PATH)) {
            stream.filter(woorden -> woorden.toUpperCase().contains(woord)).
                    forEach(sterrenbeeld -> System.out.println(sterrenbeeld));

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
