package be.vdab.hello.TakenGastenBoek21;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager {
    private static final Path FILE_PATH = Path.of("/data/gastenboek.ser");

    public void schrijfGastenboek(Gastenboek gastenboek) {
        try (var stream = new ObjectOutputStream(Files.newOutputStream(FILE_PATH))) {
            stream.writeObject(gastenboek);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public Gastenboek leesGastenboek() {
        if (Files.exists(FILE_PATH)) {
            try {
                var stream = new ObjectInputStream(Files.newInputStream(FILE_PATH));
                return (Gastenboek) stream.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                System.err.println(ex);
                return null;
            }
        }
        return new Gastenboek();
    }
}

