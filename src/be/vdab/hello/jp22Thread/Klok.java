package be.vdab.hello.jp22Thread;

import java.time.LocalDateTime;

public class Klok implements Runnable {
    @Override
    public void run() {
        boolean verderDoen = true;
        while (verderDoen) {
            System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                // Het uitvoeren van de sleep method kan een
                // InterruptedException werpen.
                // Je ziet hierover meer later in de cursus
                verderDoen = false; // Klok stopzetten
            }
        }
    }
}
