package be.vdab.hello.jp22Thread;

import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

public class InsectenLezer implements Runnable {
    private static final BigDecimal MAXIMUM = BigDecimal.valueOf(3);
    private final Path pad ;
    private final PrintStream stream;
    private int aantalRegels=0;

    public InsectenLezer(String bestand, PrintStream stream) {
        this.pad = Path.of(bestand);
        this.stream = stream;
    }

    @Override
    public void run() {
        try {
            var reader = Files.newBufferedReader(pad);
            for (String regel; (regel = reader.readLine()) != null; ) {
                var onderdelen = regel.split(";");
                var prijs = new BigDecimal(onderdelen[1]);
                if (prijs.compareTo(MAXIMUM) <= 0) {
//                    stream.println(pad.getFileName() + ":" + regel);
                    ++aantalRegels;
                }
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public int getAantalRegels() {
        return aantalRegels;
    }
}
