package be.vdab.hello.jp18Datums;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainLocaleVoorbeeld {
    public static void main(String[] args) {
        var duitsland = Locale.GERMAN;
        var huidigeDatum = LocalDate.now();
        var formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", duitsland);
        System.out.println("FOR GERMAN :" + formatter.format(huidigeDatum));

        var belgie = new Locale("nl", "BE");
        formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", belgie);
        System.out.println("FOR BELGİE :" + formatter.format(huidigeDatum));

        var turkey = new Locale("tr", "TR");
        formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", turkey);
        System.out.println("FOR TURKEY :" + formatter.format(huidigeDatum));

    }
}
