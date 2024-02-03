package be.vdab.hello.jp21Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        var afbeelgingen = Path.of("/data/afbeeldingen");
        System.out.println(afbeelgingen.getParent());
        var huidigeDirectory = Path.of("plaatselijk");
        System.out.println(huidigeDirectory.toAbsolutePath());

        System.out.println("File exist :" + Files.exists(Path.of("/data")));

        var data = Path.of("/data");
        System.out.println(" is directory? :" + Files.isDirectory(data));
        System.out.println("Düzenli dosta :" + Files.isRegularFile(data));

        System.out.println("---Een directory maken---");
        try {
            Files.createDirectory(Path.of("/data/teksten"));
        } catch (IOException e) {
            System.out.println(e);
        }


        System.out.println("---Een directory hernoemen---");
        try {
            Files.move(Path.of("/data/afbeeldingen"),
                    Path.of("/data/images"));

        } catch (IOException ex) {
            System.out.println(ex);
        }

        System.out.println("---Een directory verwijderen---");

        try {
            Files.delete(Path.of("/data/teksten"));
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("---Grootte van een bestand opvragen---");

        try {
            var size = Files.size(Path.of("/data/images/duimop.jpg"));
            System.out.println(size);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("---Een bestand kopiëren---");
        try {
            Files.copy(Path.of("/data/images/duimop.jpg"),
                    Path.of("/data/images/thumbup.jpg"));
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Een bestand hernoemen");
        try{
            Files.move(Path.of("/data/images/thumbup.jpg"),
                    Path.of("/data/images/thumb.jpg"));
        }catch (IOException ex){
            System.out.println(ex);
        }

//        System.out.println("Een bestand Verwijderen");
//        try{
//            Files.delete(Path.of("/data/images/thumb.jpg"));
//        }catch (IOException ex){
//            System.out.println(ex);
//        }

    }

}
