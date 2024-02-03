package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ArtiestenEnAlbums6 {

    private static final Path PATH = Path.of("/data/albumsartists.txt");

    public static void main(String[] args) {

        try (var stream = Files.lines(PATH)) {
            var albumsPerArtists = stream.collect(Collectors.groupingBy(
                    regel -> regel.split(",")[1]));
            albumsPerArtists.entrySet().stream()
                    .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                    .forEach(entry -> {
                                System.out.println(entry.getKey());
                                entry.getValue().stream()
                                        .map(regel -> regel.split(",")[0])
                                        .sorted()
                                        .forEach(album -> System.out.println("\t" + album));
                            }
                    );


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

