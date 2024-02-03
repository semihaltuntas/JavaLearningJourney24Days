package be.vdab.hello.Taken24Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden9 {

    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        try(var stream = Files.lines(PATH)){
            stream.map(String::toUpperCase)
                    .sorted()
                    .filter(woord-> woord.length() == 5)
                    .forEach(System.out::println);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
