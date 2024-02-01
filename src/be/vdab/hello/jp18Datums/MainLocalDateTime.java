package be.vdab.hello.jp18Datums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainLocalDateTime {
    public static void main(String[] args) {
        var nu = LocalDateTime.now();
        System.out.println("nu :" + nu);
        System.out.println(nu.getDayOfMonth());
        System.out.println(nu.getHour());

        var beginEuro = LocalDateTime.of(2002, 1, 1, 0, 0);
        System.out.println("Begin euro :" + beginEuro);
        System.out.println("is after =" + nu.isAfter(beginEuro)); //True
        System.out.println("Plus een dag :" + nu.plusDays(1));
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("After Format :" + nu.format(formatter));

    }
}
