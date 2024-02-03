package be.vdab.hello.jp21Path;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PuntMain {
    public static void main(String[] args) {

        //21.6.1 Serialization
        try {
            var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("/data/punt.ser")));
            stream.writeObject(new Punt(20, 30));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //21.6.2 Deserialization
//        try {var stream = new ObjectInputStream(Files.newInputStream(Path.of("/data/punt.ser")));
//            var punt = (Punt) stream.readObject();
//            System.out.println(punt);
//
//        } catch (IOException | ClassNotFoundException ex) {
//            System.out.println(ex);
//        }
    }
}

