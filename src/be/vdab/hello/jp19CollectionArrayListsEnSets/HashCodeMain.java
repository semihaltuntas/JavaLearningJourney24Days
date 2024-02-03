package be.vdab.hello.jp19CollectionArrayListsEnSets;

import java.util.HashSet;
import java.util.Set;

public class HashCodeMain {
    public static void main(String[] args) {
        var tekst = "auto";
        System.out.println(tekst + " ,hashcode: " + tekst.hashCode());
        tekst = "huis";
        System.out.println(tekst + " ,hashcode: " + tekst.hashCode());


        Set<Coordinate> set = new HashSet<>();
        set.add(new Coordinate(11, 20));
        set.add(new Coordinate(13, 20));
        set.add(new Coordinate(10, 21));
        set.add(new Coordinate(23,10));

        for (Coordinate coord : set) {
            System.out.println("Coordinaat hashcode: " + coord.hashCode());
        }
    }
}


