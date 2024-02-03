package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LaatsteLand8 {
    private static final Path PATH = Path.of("/data/landcodes.txt");

    public static void main(String[] args) {

        try(var stream = Files.lines(PATH)){
            stream.map(regel->regel.split(" ")[1])
                    .max((land1,land2)-> land1.compareToIgnoreCase(land2))
                    .ifPresent(laatsteLand-> System.out.println(laatsteLand));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
