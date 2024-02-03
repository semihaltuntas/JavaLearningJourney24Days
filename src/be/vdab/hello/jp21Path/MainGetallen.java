package be.vdab.hello.jp21Path;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainGetallen {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tik getallen. tik 0 om te stoppen :");
//        try (var writer = new PrintWriter(Files.newBufferedWriter(Path.of("/data/getallen.txt")))) {
//            for (int getal; (getal = scanner.nextInt()) != 0; ) {
//                writer.println(getal);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//
//        try {
//            var scanner1 = new Scanner(Files.newBufferedReader(Path.of("/data/getallen.txt")));
//            while (scanner1.hasNext()) {
//                System.out.println(scanner1.nextInt());
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        //Binaire Bestanden :
        System.out.println("------------");

        try {
            var input = Files.newInputStream(Path.of("/data/images/duimop.jpg"));
            var output = Files.newOutputStream(Path.of("/data/images/thumbup.jpg"));
            for (int eenByte; (eenByte = input.read()) != -1; ) {
                output.write(eenByte);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        // De inhoud van een directory opvragen => bir dizinin icerıgını sorgulama

        try {
            var stream = Files.newDirectoryStream(Path.of("/data"));
            for (var path : stream) {
                System.out.println(path);
                System.out.println(Files.isDirectory(path) ? ":directory" : ":bestand");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }


    }
}




