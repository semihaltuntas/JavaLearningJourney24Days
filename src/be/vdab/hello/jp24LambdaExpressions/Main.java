package be.vdab.hello.jp24LambdaExpressions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class Main {
    private static final Path COUNTRIES_PATH = Path.of("/data/countries.txt");
    private static final Path COUNTRIES_BACKUP_PATH = Path.of("/data/countries.bak");
    private static final Path LANGUAGES_PATH = Path.of("/data/languages.txt");
    private static final Path LANGUAGES_BACKUP_PATH = Path.of("/data/languages.bak");


    private static void legeRegelsVerwijderen() {
        try {
            Files.deleteIfExists(COUNTRIES_BACKUP_PATH);
            Files.move(COUNTRIES_PATH, COUNTRIES_BACKUP_PATH);

            try (var reader = Files.newBufferedReader(COUNTRIES_BACKUP_PATH);
                 var writer = Files.newBufferedWriter(COUNTRIES_PATH)) {
                for (String regel; (regel = reader.readLine()) != null; ) {

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
        var uniekeTalen = new LinkedHashSet<String>();
        try {
            Files.deleteIfExists(LANGUAGES_BACKUP_PATH);
            Files.move(LANGUAGES_PATH, LANGUAGES_BACKUP_PATH);
            try (var reader = Files.newBufferedReader(LANGUAGES_BACKUP_PATH)) {
                for (String regel; (regel = reader.readLine()) != null; ) {

                    uniekeTalen.add(regel);

                }
            }
            try (var writer = new PrintWriter(
                    Files.newBufferedWriter(LANGUAGES_PATH))) {
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

