package be.vdab.hello.jp20CollectionsCursusTreeSet;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class CursusMain {
    public static void main(String[] args) {
        var cursessen = new TreeSet<Cursus>();

        cursessen.add(new Cursus(5, "Word", 100));
        cursessen.add(new Cursus(3, "Excel", 110));
        cursessen.add(new Cursus(1, "Windows", 90));
        cursessen.add(new Cursus(4, "Access", 120));
        cursessen.add(new Cursus(2, "Powerpoint", 80));
        cursessen.add(new Cursus(6, "Photoshop", 100));


        Date asa = new Date();
        Cursus bb = new Cursus(5, "Word", 100);
        Cursus cc = new Cursus(5, "ddd", 100);
        Cursus dd = new Cursus(6, "Word", 100);
        System.out.println("------------------");
        System.out.println(cc.equals(dd));

        for (var cursus : cursessen) {

            System.out.println(cursus);
        }
        System.out.println(cursessen.getFirst());

        var fruit = new TreeSet<String>(new DescendingComparator());
        fruit.addAll(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        for (var stukFruit : fruit) {
            System.out.println(stukFruit + " ");
        }

        /*
        Deze eigen Comparator klasse kunnen we ook gebruiken met een List:
        var fruit = new ArrayList<String>();
         fruit.add("Banaan");
         fruit.add("Appel");
         fruit.add("Peer");
         fruit.add("Aardbei");
         fruit.add( "Druif");
         fruit.sort(new DescendingComparator());
         */

    }
}
