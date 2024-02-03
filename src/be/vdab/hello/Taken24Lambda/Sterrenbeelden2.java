package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden2 {

    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {

        try (var stream = Files.lines(PATH)) {
            stream.forEach(dieren -> System.out.println(dieren.toUpperCase()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
