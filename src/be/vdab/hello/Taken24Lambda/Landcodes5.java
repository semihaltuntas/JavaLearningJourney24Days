package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Landcodes5 {
    private static final Path PATH = Path.of("/data/landcodes.txt");

    public static void main(String[] args) {
        try(var stream = Files.lines(PATH)){
            stream.map(regel->regel.split(" "))
                    .map(regel->regel[1])
                    .distinct()
                    .sorted()
                    .forEach(land-> System.out.println(land));
        }catch (IOException ex){ ex.printStackTrace();}
    }
}
