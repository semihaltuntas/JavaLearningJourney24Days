package be.vdab.hello.Taken20CollectionsTienkamper;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("println(\"Alle tienkampers uit de arraylist (=volgorde van toevoegen):\"");
        var tienkampers = new ArrayList<Tienkamper>();

        tienkampers.add(new Tienkamper("Semih", 20));
        tienkampers.add(new Tienkamper("Mustafa", 70));
        tienkampers.add(new Tienkamper("Kadir", 50));
        tienkampers.add(new Tienkamper("Ayhan", 40));

        for (var tienkamper : tienkampers) {
            System.out.println(tienkamper.toString());
        }
        System.out.println("Alle tienkampers uit de treeset (=gesorteerd op naam):");
        var runners = new TreeSet<Tienkamper>();
        runners.add(new Tienkamper("Semih", 20));
        runners.add(new Tienkamper("Mustafa", 70));
        runners.add(new Tienkamper("Kadir", 50));
        runners.add(new Tienkamper("Ayhan", 40));

        for (var runner : runners) {
            System.out.println(runner);
        }
    }
}

