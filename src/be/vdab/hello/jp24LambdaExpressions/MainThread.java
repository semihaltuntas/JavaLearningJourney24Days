package be.vdab.hello.jp24LambdaExpressions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

class MainThread {
    private static final Path Countries_Path = Path.of("/data/countries.txt");
    private static final Path Counties_Backup_Path = Path.of("/data/countries.bak");
    private static final Path Languages_Path = Path.of("/data/languages.txt");
    private static final Path Languages_Backup_Path = Path.of("/data/languages.bak");


    private static void legeRegelsVerwijderen() {
        try {
            Files.deleteIfExists(Counties_Backup_Path);
            Files.move(Countries_Path, Counties_Backup_Path);
            try (
                    var reader = Files.newBufferedReader(Counties_Backup_Path);
                    var writer = Files.newBufferedWriter(Countries_Path)) {
                for (String regel; (regel = reader.readLine()) != null;) {
                    if (!regel.isBlank()) {
                        writer.write(regel);
                        writer.newLine();
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    private static void dubbelsVerwijderen() {
        LinkedHashSet<String> uniekeTalen = new LinkedHashSet<>();
        try {
            Files.deleteIfExists(Languages_Backup_Path);
            Files.move(Languages_Path, Languages_Backup_Path);
            try (var reader = Files.newBufferedReader(Languages_Backup_Path)) {
                for (String regel; (regel = reader.readLine()) != null; ) {

                    uniekeTalen.add(regel);

                }
            }
            try (var writer = new PrintWriter(Files.newBufferedWriter(Languages_Path))) {
                for (var taal : uniekeTalen) {
                    writer.println(taal);

                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        new Thread(() -> legeRegelsVerwijderen()).start();
        new Thread(() -> dubbelsVerwijderen()).start();

    }
}
