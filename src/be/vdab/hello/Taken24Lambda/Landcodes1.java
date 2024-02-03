package be.vdab.hello.Taken24Lambda;

import javax.crypto.spec.OAEPParameterSpec;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class Landcodes1 {
    private static final Path path = Path.of("/data/landcodes.txt");

    private static Optional<String> landNaam(String landnaam) {
        try (var reader = Files.newBufferedReader(path)) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                var split = regel.split(" ");
                if (landnaam.equalsIgnoreCase(split[0])) {
                    return Optional.of(split[1]);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    public static void main(String[] args) {


        landNaam("be").ifPresent(landnaam -> System.out.println(landnaam));
    }

}













