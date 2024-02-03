package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArtiestenNamen5 {
    private static final Path PATH = Path.of("/data/albumsartists.txt");

    public static void main(String[] args) {

        try (var stream = Files.lines(PATH)) {
            stream.map(regel -> regel.split(",")).map(regel -> regel[1])
                    .distinct()
                    .sorted()
                    .forEach(naam -> System.out.println(naam));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
