package be.vdab.hello.TakenGastenBoek21;

import java.io.PipedReader;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy/ HH:mm");
    private LocalDateTime datum = LocalDateTime.now();
    private String schrijver;
    private String boodschap;

    public GastenboekEntry(String schrijver, String boodschap) {
        setSchrijver(schrijver);
        setBoodschap(boodschap);
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        if (datum == null) {
            throw new DateTimeException("je moet hier vullen!");
        }
        this.datum = datum;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public void setSchrijver(String schrijver) {
        if (schrijver.isBlank()) {
            throw new IllegalArgumentException("Schrijver mag niet leeg zijn!");
        }
        this.schrijver = schrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }

    public void setBoodschap(String boodschap) {
        if (boodschap.isBlank()) {
            throw new IllegalArgumentException("boodschap mag niet leeg zijn!");
        }
        this.boodschap = boodschap;
    }

    @Override
    public String toString() {
        return datum + " : " + schrijver + " : " + boodschap;
    }
}
