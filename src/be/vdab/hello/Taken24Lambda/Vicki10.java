package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Vicki10 {
    private static final Path PATH = Path.of("/data/acteurs-actrices.csv");

    public static void main(String[] args) {

        try (var stream = Files.lines(PATH)) {
            System.out.println(stream
                    .map(regel -> regel.split(";")[0])
                    .anyMatch(naam -> naam.equals("Vicki"))
                    ? "komt voor" : "komt niet voor");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
