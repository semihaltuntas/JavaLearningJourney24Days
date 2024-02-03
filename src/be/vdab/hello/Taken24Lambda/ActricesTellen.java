package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ActricesTellen {
    private static final Path PATH = Path.of("/data/acteurs-actrices.csv");

    public static void main(String[] args) {

        try (var stream = Files.lines(PATH)) {
            System.out.println(
                    stream
                    .map(regel -> regel.split(";")[2])
                    .filter(teken ->  teken.equals("F"))
                    .count());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
