package be.vdab.hello.jp21Path;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainPath2 {
    public static void main(String[] args) {
       /* Dosyaların okunması bölümü */


//        try {
//            var regels = Files.readAllLines(Path.of("/data/insecten1.csv");
//            for (var regel : regels) {
//                System.out.println(regel);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        System.out.println("---De tekst van een bestand in blokken lezen---");

        //Eerste weg :
//        try {
//            var reader = Files.newBufferedReader(Path.of("/data/insecten1.csv"));
//            try {
//                var regel = reader.readLine();
//                while (regel != null) {
//                    System.out.println(regel);
//                    regel = reader.readLine();
//                }
//            } catch (IOException e) {
//                System.out.println(e);
//            } finally {
//                reader.close();
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        //Tweede weg : Korte code
//        try {
//            var reader = Files.newBufferedReader(Path.of("/data/insecten1.csv"));
//            for (String regel; (regel = reader.readLine()) != null; )
//                System.out.println(regel);
//        } catch (IOException e) {
//            System.out.println(e);
//        }

        // Tekst schrijven naar een bestand

        try(var writer = Files.newBufferedWriter(Path.of("/data/naam.txt"))){
            writer.write("Jean");
        }catch (IOException ex){
            System.out.println(ex);
        }
       // Tekst Lezen
        try (var reader = Files.newBufferedReader(Path.of("/data/naam.txt"))) {
         for (String line; (line = reader.readLine()) != null;){
             System.out.println(line);
         }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
